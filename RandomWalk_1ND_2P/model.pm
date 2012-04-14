// ROBOT SWARM SCENARIO
// A finite number of robots random walk on a grid
// Robots can see each other only at one step distance
// We want to analyse a randomized strategy that minimize collisions

// 1x nondeterministc robot
// 2x random robot

mdp

// === CONSTANTS ===

// number of step in analysis
const int k;
// grid dimension
const int DIM;
// robot 1 start position
const int x1_0;
const int y1_0;
// robot 2 start position
const int x2_0;
const int y2_0;
// robot 3 start position
const int x3_0;
const int y3_0;


// === LABELS ===

// global states
label "collision_1_2" = x1=x2 & y1=y2;
label "collision_2_3" = x2=x3 & y2=y3;
label "collision_1_3" = x1=x3 & y1=y3;
label "collision" = (x1=x2 & y1=y2) | (x2=x3 & y2=y3) | (x1=x3 & y1=y3);

// === MODULES ===

// nondeterministic robot 1 module
module nondet_robot_1
	x1 : [1..DIM] init x1_0;
	y1 : [1..DIM] init y1_0;
	
	// choose a free direction nondeterministically
	[step] x1>1 & (x1-1!=x2 | y1!=y2) 	-> (x1'=x1-1);
	[step] x1<DIM & (x1+1!=x2 | y1!=y2) 	-> (x1'=x1+1);
	[step] y1>1 & (y1-1!=y2 | x1!=x2) 	-> (y1'=y1-1);
	[step] y1<DIM & (y1+1!=y2 | x1!=x2)	-> (y1'=y1+1);

endmodule

// random robot 2 module
module random_robot_2
	x2 : [1..DIM] init x2_0;
	y2 : [1..DIM] init y2_0;
	
	// choose a free direction at random (uniformly)

	// no free directions, stay in place
	// cases: in the corner with 2 robots around
	
	[step]	(x2=1 & y2=1 & ((x1=1 & y1=2 & x3=2 & y3=1) 
		| (x1=2 & y1=1 & x3=1 & y3=2))) -> true;
	[step]	(x2=1 & y2=DIM & ((x1=1 & y1=DIM-1 & x3=2 & y3=DIM) 
		| (x1=2 & y1=DIM & x3=1 & y3=DIM-1))) -> true;
	[step]	(x2=DIM & y2=1 & ((x1=DIM & y1=2 & x3=DIM-1 & y3=1) 
		| (x1=DIM-1 & y1=1 & x3=DIM & y3=2))) -> true;
	[step]	(x2=DIM & y2=DIM & ((x1=DIM & y1=DIM-1 & x3=DIM-1 & y3=DIM) 
		| (x1=DIM-1 & y1=DIM & x3=DIM & y3=DIM-1))) -> true;

	// one free direction
	// cases: in the corner with one robot around or along a wall with two robots around

	// east free
	[step]	(x2=1 & y2=1 & ((x1=1 & y1=2 & !(x3=2 & y3=1)) 
		| (x1=2 & y1=1 & !(x3=1 & y3=2)))) -> 1 : (x2'=x2+1);
	[step]	(x2=1 & y2=DIM & ((x1=1 & y1=DIM-1 & !(x3=2 & y3=DIM)) 
		| (x1=2 & y1=DIM & !(x3=1 & y3=DIM-1)))) -> 1 : (x2'=x2+1);
	// ...
	[step]	(x2=1 & y2=1 & ((x1=1 & y1=2 & !(x3=2 & y3=1)) | (x1=2 & y1=1 & !(x3=1 & y3=2)))) -> 1 : (x2'=x2+1);
	[step]	(x2=1 & y2=1 & ((x1=1 & y1=2 & !(x3=2 & y3=1)) | (x1=2 & y1=1 & !(x3=1 & y3=2)))) -> 1 : (x2'=x2+1);


	// west free
	[step]	(x2=DIM & y2=1 & x1=DIM & y1=2) |
		(x2=DIM & y2=DIM & x1=DIM & y1=DIM-1) -> 1 : (x2'=DIM-1);
	// south free
	[step]	(x2=1 & y2=DIM & x1=2 & y1=DIM) |
		(x2=DIM & y2=DIM & x1=DIM-1 & y1=DIM) -> 1 : (y2'=DIM-1);
	// north free
	[step]	(x2=1 & y2=1 & x1=2 & y1=1) |
		(x2=DIM & y2=1 & x1=DIM-1 & y1=1) -> 1 : (y2'=2);

	// two free directions
	// cases: in the corner with no robots around or along a wall with a robot around

	// north and east free
	[step]	(x2=1 & y2=1 & !((x1=1 & y1=2) | (x1=2 & y1=1)) ) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2+1);
	[step]	(x2>1 & x2<DIM & y2=1 & x1=x2-1 & y1=1) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2+1);
	[step]	(x2=1 & y2>1 & y2<DIM & x1=1 & y1=y2-1) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2+1);

	// east and south free
	[step]	(x2=1 & y2=DIM & !((x1=1 & y1=DIM-1) | (x1=2 & y1=DIM)) ) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2-1);
	[step]	(x2>1 & x2<DIM & y2=DIM & x1=x2-1 & y1=DIM) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2-1);
	[step]	(x2=1 & y2>1 & y2<DIM & x1=1 & y1=y2+1) -> 1/2 : (x2'=x2+1) + 1/2 : (y2'=y2-1);

	// west and north free
	[step]	(x2=DIM & y2=1 & !((x1=DIM & y1=2) | (x1=DIM-1 & y1=1)) ) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2+1);
	[step]	(x2>1 & x2<DIM & y2=1 & x1=x2+1 & y1=1) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2+1);
	[step]	(x2=DIM & y2>1 & y2<DIM & x1=DIM & y1=y2-1) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2+1);

	// west and south free
	[step]	(x2=DIM & y2=DIM & !((x1=DIM & y1=DIM-1) | (x1=DIM-1 & y1=DIM)) ) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2-1);
	[step]	(x2>1 & x2<DIM & y2=DIM & x1=x2+1 & y1=DIM) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2-1);
	[step]	(x2=DIM & y2>1 & y2<DIM & x1=DIM & y1=y2+1) -> 1/2 : (x2'=x2-1) + 1/2 : (y2'=y2-1);
		
	// three free directions
	// cases: along a wall with no robots around or far from walls with one robot around

	// north blocked
	[step]	(x2>1 & x2<DIM & y2=DIM & !((y1=DIM & (x1=x2-1 | x1=x2+1)) | (y1=DIM-1 & x1=x2))) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2-1);
	[step]	(x2>1 & x2<DIM & y2>1 & y2<DIM & x1=x2 & y1=y2+1) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2-1);

	// east blocked
	[step]	(x2=DIM & y2>1 & y2<DIM & !((x1=DIM & (y1=y2-1 | y1=y2+1)) | (x1=DIM-1 & y1=y2))) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (y2'=y2+1) + 1/3 : (y2'=y2-1);
	[step]	(x2>1 & x2<DIM & y2>1 & y2<DIM & x1=x2+1 & y1=y2) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (y2'=y2+1) + 1/3 : (y2'=y2-1);

	// south blocked
	[step]	(x2>1 & x2<DIM & y2=1 & !((y1=1 & (x1=x2-1 | x1=x2+1)) | (y1=2 & x1=x2))) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2+1);
	[step]	(x2>1 & x2<DIM & y2>1 & y2<DIM & x1=x2 & y1=y2-1) 
			-> 1/3 : (x2'=x2-1) + 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2+1);

	// west blocked
	[step]	(x2=1 & y2>1 & y2<DIM & !((x1=1 & (y1=y2-1 | y1=y2+1)) | (x1=2 & y1=y2))) 
			-> 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2+1) + 1/3 : (y2'=y2-1);
	[step]	(x2>1 & x2<DIM & y2>1 & y2<DIM & x1=x2-1 & y1=y2) 
			-> 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2+1) + 1/3 : (y2'=y2-1);

	// four free directions
	// cases: far from walls and other robots
	[step] (x2>1 & x2<DIM & y2>1 & y2<DIM & !((x1=x2 & (y1=y2-1 | y1=y2+1)) | (y1=y2 & (x1=x2-1 | x1=x2+1)))) 
			-> 1/4 : (x2'=x2-1) + 1/4 : (x2'=x2+1) + 1/4 : (y2'=y2-1) + 1/4 : (y2'=y2+1);

endmodule




