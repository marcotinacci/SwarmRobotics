// ROBOT SWARM SCENARIO
// A finite number of robots random walk on a grid
// Robots can see each other only at one step distance
// We want to analyse a randomized strategy that minimize collisions

// 2x random robots

dtmc

// === CONSTANTS ===

// number of step in analysis
//const int k;
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

// sensor properties 1
formula ef1 = x1>1 & (x1-1!=x2 | y1!=y2);
formula wf1 = x1<DIM & (x1+1!=x2 | y1!=y2);
formula sf1 = y1>1 & (y1-1!=y2 | x1!=x2);
formula nf1 = y1<DIM & (y1+1!=y2 | x1!=x2);

// random robot 1 module
module random_robot_1
	x1 : [1..DIM] init x1_0;
	y1 : [1..DIM] init y1_0;
	
	// choose a free direction at random (uniformly)
	[step] ef1 -> (x1'=x1-1);
	[step] wf1 -> (x1'=x1+1);
	[step] sf1 -> (y1'=y1-1);
	[step] nf1 -> (y1'=y1+1);

endmodule

// random robot 2 module
module random_robot_2 = random_robot_1 [x2=x1, x1=x2, y2=y1, y1=y2, x1_0=x2_0, y1_0=y2_0] endmodule

