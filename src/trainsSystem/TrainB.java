
package trainsSystem;

/* Train type B Process class*/
class TrainB extends Thread {
    
    
    String trainName;
    TrainTrack theTrack;
    //initialise (constructor)
    public TrainB(String trainName, TrainTrack theTrack) {
        this.trainName = trainName;
        this.theTrack = theTrack;
    }

    @Override
    public void run() {   // start train Process
        // wait for clearance before moving on to the track
        theTrack.trainB_MoveOnToTrack(trainName); // move on to track B
        theTrack.trainB_MoveAroundToSharedTrack(trainName); // move around B loop
        theTrack.trainB_MoveAlongSharedTrack(trainName); // move along shared track
        theTrack.trainB_FinishTrack(trainName); //Finishing moving around loop
        theTrack.trainB_MoveOffTrack(trainName); // move off the track
    } // end run
} // end trainBProcess
