/******************************************************************************
 *  Name:    
 *  NetID:   
 *  Precept: 
 *
 *  Partner Name:    
 *  Partner NetID:   
 *  Partner Precept: 
 * 
 * Description: 
 *  
 * This is a template file for GuitarString.java. It lists the constructors
 * and methods you need, along with descriptions of what they're supposed
 * to do.
 *  
 * Note: it won't compile until you fill in the constructors and methods
 *       (or at least commment out the ones whose return type is non-void).
 *
 ******************************************************************************/

public class GuitarString {
    // YOUR INSTANCE VARIABLES HERE
	private RingBuffer ring;
	private int rsize,ttic;
    // creates a guitar string of the specified frequency,
    // using sampling rate of 44,100
    public GuitarString(double frequency) {
        // YOUR CODE HERE
    	int a = (int)Math.ceil(44100/frequency);
    	ring = new RingBuffer(a);
    	rsize = a;
    }

    // creates a guitar string whose size and initial values are given by
    // the specified array
    public GuitarString(double[] init) {
        // YOUR CODE HERE
    }

    // returns the number of samples in the ring buffer
    public int length() {
        // YOUR CODE HERE
    	return ring.size();
    }

    // plucks the guitar string (by replacing the buffer with white noise)
    public void pluck() {
        // YOUR CODE HERE
    }

    // advances the Karplus-Strong simulation one time step
    public void tic() {
        // YOUR CODE HERE
    	double x = ring.peek();
    	ring.dequeue();
    	double y = ring.peek();
    	double xy = (x+y)/(2)*(.994);
    	ring.enqueue(xy);
    }

    // returns the current sample
    public double sample() {
        // YOUR CODE HERE
    	return ring.peek();
    }
    
    public int Time() {
    	return ttic;
    }
    

    // tests and calls every constructor and instance method in this class
    public static void main(String[] args) {
        // YOUR CODE HERE
    }

}
