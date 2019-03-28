package trainsSystem;

class  CDS {
    public static void idleQuietly(int millisecs) {
        try {
            Thread.sleep(millisecs);
        } catch (InterruptedException e) { }
    }
} // end CDS
