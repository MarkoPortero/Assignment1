# Concurrency Java Exercise
Concurrency

Simple concurrency exercise. 
A toy car/train track is shown below. 
Trains of type A enter via section 0 and rotate clockwise around block A, before exiting at position 11. 
Trains of type B enter via section 12 and rotate clockwise around block B, before exiting at position 21. 
(Note. All trains share sections 4 and 7).

 
Trains are not allowed to stop at a corner, so they move, for example, from section 2 directly to slot 3. 
A train joining the circuit  must first make sure the section ahead of it is free 
(e.g. A train entering via section 0, for example, must ensure that section “0” is unoccupied at that time). 
To avoid train crashes only one train can at a particular instant, be in any of the available sections. 
In addition, a train should not be forced to stop on a crossing (junction), 
so for example when a train is moving from section 3 over junction 4 it should have clearance to move into section 5.
