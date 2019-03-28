package trainsSystem;

class TrainTrackDriver {

    static final int NUM_OF_A_TRAINS = 4;
    static final int NUM_OF_B_TRAINS = 4;
    static TrainTrack theTrainTrack;

    public static void main(String[] args) {

        // create a train track
        theTrainTrack = new TrainTrack();

        System.out.println("Trains are in motion...Please wait....");

        // create arrays to hold the trains
        TrainA[] trainAS = new TrainA[NUM_OF_A_TRAINS];
        TrainB[] trainBProcess = new TrainB[NUM_OF_B_TRAINS];

        // create trains to enter the track
        for (int i = 0; i < NUM_OF_A_TRAINS; i++) {
            CDS.idleQuietly((int) (Math.random() * 1000));
            trainAS[i] = new TrainA("A" + i, theTrainTrack);
        }
        for (int i = 0; i < NUM_OF_B_TRAINS; i++) {
            CDS.idleQuietly((int) (Math.random() * 1000));
            trainBProcess[i] = new TrainB("B" + i, theTrainTrack);
        }

        // set the train processes running
        for (int i = 0; i < NUM_OF_A_TRAINS; i++) {
            trainAS[i].start();
        } // end for
        for (int i = 0; i < NUM_OF_B_TRAINS; i++) {
            trainBProcess[i].start();
        } // end for

        // trains now travelling
        //  wait for all the train threads to finish before printing out final message.
        for (int i = 0; i < NUM_OF_A_TRAINS; i++) {
            try {
                trainAS[i].join();
            } catch (InterruptedException ex) {
            }
        } // end for

        for (int i = 0; i < NUM_OF_B_TRAINS; i++) {
            try {
                trainBProcess[i].join();
            } catch (InterruptedException ex) {
            }
        } // end for

        // Display all the train activity that took place
        theTrainTrack.theTrainActivity.printActivities();

        // Final message
        theTrainTrack.printTrains();
        System.out.println("All trains are back");
    } // end main

} // end TrainsOnTrack class

