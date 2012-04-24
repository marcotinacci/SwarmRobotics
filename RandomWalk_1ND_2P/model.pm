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

label "collision_1_2" = x1=x2 & y1=y2;
label "collision_2_3" = x2=x3 & y2=y3;
label "collision_1_3" = x1=x3 & y1=y3;
label "collision" = (x1=x2 & y1=y2) | (x2=x3 & y2=y3) | (x1=x3 & y1=y3);

label "detect_1_2" = (x1=x2 & (y1=y2+1 | y1=y2-1)) | (y1=y2 & (x1=x2+1 | x1=x2-1));
label "detect_2_3" = (x2=x3 & (y2=y3+1 | y2=y3-1)) | (y2=y3 & (x2=x3+1 | x2=x3-1));
label "detect_1_3" = (x1=x3 & (y1=y3+1 | y1=y3-1)) | (y1=y3 & (x1=x3+1 | x1=x3-1));
label "detect" = (x1=x2 & (y1=y2+1 | y1=y2-1)) | (y1=y2 & (x1=x2+1 | x1=x2-1)) |
	(x2=x3 & (y2=y3+1 | y2=y3-1)) | (y2=y3 & (x2=x3+1 | x2=x3-1)) |
	(x1=x3 & (y1=y3+1 | y1=y3-1)) | (y1=y3 & (x1=x3+1 | x1=x3-1));

// === MODULES ===

formula nf1 = (x1!=x2 | y1!=y2-1) & (x1!=x3 | y1!=y3-1) & y1<DIM;
formula sf1 = (x1!=x2 | y1!=y2+1) & (x1!=x3 | y1!=y3+1) & y1>1;
formula ef1 = (x1!=x2-1 | y1!=y2) & (x1!=x3-1 | y1!=y3) & x1<DIM;
formula wf1 = (x1!=x2+1 | y1!=y2) & (x1!=x3+1 | y1!=y3) & x1<1;

// nondeterministic robot 1 module
module nondet_robot_1
	x1 : [1..DIM] init x1_0;
	y1 : [1..DIM] init y1_0;
	
	// choose a free direction or don't move nondeterministically
	[step]	nf1	-> (y1'=y1+1);
	[step]	sf1	-> (y1'=y1-1);
	[step]	ef1	-> (x1'=x1+1);
	[step]	wf1	-> (x1'=x1-1);
	[step]	true	-> true;

endmodule

formula nf2 = (x2!=x1 | y2!=y1-1) & (x2!=x3 | y2!=y3-1) & y2<DIM;
formula sf2 = (x2!=x1 | y2!=y1+1) & (x2!=x3 | y2!=y3+1) & y2>1;
formula ef2 = (x2!=x1-1 | y2!=y1) & (x2!=x3-1 | y2!=y3) & x2<DIM;
formula wf2 = (x2!=x1+1 | y2!=y1) & (x2!=x3+1 | y2!=y3) & x2>1;

// random robot 2 module
module random_robot_2
	x2 : [1..DIM] init x2_0;
	y2 : [1..DIM] init y2_0;
	
	// choose a free direction at random (uniformly)

	// no free directions
	
	[step] !nf2 & !sf2 & !ef2 & !wf2 -> 1 : true;

	// one free direction

	// east free
	[step]	!nf2 & !sf2 & ef2 & !wf2 -> 1/2 : (x2'=2) + 1/2 : true;
	// west free
	[step]	!nf2 & !sf2 & !ef2 & wf2 -> 1/2 : (x2'=DIM-1) + 1/2 : true;
	// south free
	[step]	!nf2 & sf2 & !ef2 & !wf2 -> 1/2 : (y2'=DIM-1) + 1/2 : true;
	// north free
	[step]	nf2 & !sf2 & !ef2 & !wf2 -> 1/2 : (y2'=2) + 1/2 : true;

	// two free directions

	// north and east free
	[step]	nf2 & !sf2 & ef2 & !wf2 -> 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2+1) + 1/3 : true;
	// east and south free
	[step]	!nf2 & sf2 & ef2 & !wf2 -> 1/3 : (x2'=x2+1) + 1/3 : (y2'=y2-1) + 1/3 : true;
	// west and north free
	[step]	nf2 & !sf2 & !ef2 & wf2 -> 1/3 : (x2'=x2-1) + 1/3 : (y2'=y2+1) + 1/3 : true;
	// west and south free
	[step]	!nf2 & sf2 & !ef2 & wf2 -> 1/3 : (x2'=x2-1) + 1/3 : (y2'=y2-1) + 1/3 : true;
	// north and south free
	[step]	nf2 & sf2 & !ef2 & !wf2 -> 1/3 : (y2'=y2+1) + 1/3 : (y2'=y2-1) + 1/3 : true;
	// east and west free
	[step]	!nf2 & !sf2 & ef2 & wf2 -> 1/3 : (x2'=x2-1) + 1/3 : (x2'=x2+1) + 1/3 : true;

	// three free directions

	// north blocked
	[step]	!nf2 & sf2 & ef2 & wf2 -> 1/4 : (x2'=x2-1) + 1/4 : (x2'=x2+1) + 1/4 : (y2'=y2-1) + 1/4 : true;
	// east blocked
	[step]	nf2 & sf2 & !ef2 & wf2 -> 1/4 : (x2'=x2-1) + 1/4 : (y2'=y2+1) + 1/4 : (y2'=y2-1) + 1/4 : true;
	// south blocked
	[step]	nf2 & !sf2 & ef2 & wf2 -> 1/4 : (x2'=x2-1) + 1/4 : (x2'=x2+1) + 1/4 : (y2'=y2+1) + 1/4 : true;
	// west blocked
	[step]	nf2 & sf2 & ef2 & !wf2 -> 1/4 : (x2'=x2+1) + 1/4 : (y2'=y2+1) + 1/4 : (y2'=y2-1) + 1/4 : true;

	// four free directions

	[step] nf2 & sf2 & ef2 & wf2 -> 1/5 : (x2'=x2-1) + 1/5 : (x2'=x2+1) + 1/5 : (y2'=y2-1) + 1/5 : (y2'=y2+1) + 1/5 : true;

endmodule

// random robot 3 module

module random_robot_3 = random_robot_2 [x2=x3, y2=y3, x3=x2, y3=y2, x2_0=x3_0, y2_0=y3_0] endmodule


