// ROBOT SWARM SCENARIO
// A finite number of robots random walk on a grid
// Robots can see each other only at one step distance
// We want to analyse a randomized strategy that minimize collisions

// 1x nondeterministc robot
// 1x random robot

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

// === LABELS ===

// global states
label "collision" = x1=x2 & y1=y2;

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

	// one free direction
	// cases: in the corner with one robot around

	// east free
	[step]	(x2=1 & y2=1 & x1=1 & y1=2) |
		(x2=1 & y2=DIM & x1=1 & y1=DIM-1) -> 1 : (x2'=2);
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

	// TODO north and south free

	// TODO east and west free

	

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




