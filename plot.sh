#!/bin/sh
# Marco Tinacci 09/04/2012
# This shell script read the positions of robots from input files and plot a png image for each tick of the simulation, it automatically recognize if the file is describing a 2 or 3 robots simulation and generate a new folder containing all the png images.
# $1: data filename

if [ $(head -1 $1 | wc -w) = 8 ]
then 
	nbots=3 
else 
	nbots=2 
fi
lines=$(wc -l < $1)
folder="sim_"`eval date +%Y%m%d_%H%M%S`
mkdir $folder
for ((i=1 ; i<$lines ; i++))
do
    gnuplot <<EOF
set term png
set xrange [0:11]
set yrange [0:11]
set xtics 1
set ytics 1
set grid
set output "$folder/img_$i.png"
if ($nbots == 3) \\
	plot '$1' using 3:4 every ::$i::$i with p ls 1, \\
		'$1' using 5:6 every ::$i::$i with p ls 2, \\
		'$1' using 7:8 every ::$i::$i with p ls 3 ; else \\
	plot '$1' using 3:4 every ::$i::$i with p ls 1, \\
		'$1' using 5:6 every ::$i::$i with p ls 2
	
EOF
done