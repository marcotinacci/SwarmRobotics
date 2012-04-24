// ROBOT SWARM SCENARIO
// A finite number of robots random walk on a grid
// Robots can see each other only at one step distance
// We want to analyse a randomized strategy that minimize collisions

// 3x random robots

dtmc

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

// sensor properties
formula east_free = x1>1 & (x1-1!=x2 | y1!=y2) & (x1-1!=x3 | y1!=y3);
formula west_free = x1<DIM & (x1+1!=x2 | y1!=y2) & (x1+1!=x3 | y1!=y3);
formula south_free = y1>1 & (y1-1!=y2 | x1!=x2) & (y1-1!=y3 | x1!=x3);
formula north_free = y1<DIM & (y1+1!=y2 | x1!=x2) & (y1+1!=y3 | x1!=x3);

// robot 1 module
module robot1
	x1 : [1..DIM] init x1_0;
	y1 : [1..DIM] init y1_0;
	
	// choose a free direction at random (uniformly)
	[step] east_free -> (x1'=x1-1);
	[step] west_free -> (x1'=x1+1);
	[step] south_free -> (y1'=y1-1);
	[step] north_free -> (y1'=y1+1);

endmodule

// robot 2 module
module robot2 = robot1 [x1=x2, y1=y2, x2=x3, y2=y3, x3=x1, y3=y1, x1_0=x2_0, y1_0=y2_0] endmodule
// robot 3 module
module robot3 = robot1 [x1=x3, y1=y3, x2=x1, y2=y1, x3=x2, y3=y2, x1_0=x3_0, y1_0=y3_0] endmodule