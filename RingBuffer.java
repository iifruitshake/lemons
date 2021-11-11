/******************************************************************************
 *  Name:    
 *  NetID:   
 *  Precept: 
 *
 *  Partner Name:    
 *  Partner NetID:   
 *  Partner Precept: 
 * 
 *  Description:  
 *
 * This is a template file for RingBuffer.java. It lists the constructors and
 * methods you need, along with descriptions of what they're supposed to do.
 *  
 * Note: it won't compile until you fill in the constructors and methods
 *       (or at least commment out the ones whose return type is non-void).
 *
 ******************************************************************************/

public class RingBuffer {
    // YOUR INSTANCE VARIABLES HERE
	private int[] ring;
	int frnt,back;
    // You are creating a circular queue.
    // Look up how to create a cirucular queue using an array.

    //must use and array   []

    // creates an empty ring buffer with the specified capacity
    public RingBuffer(int capacity) {
        // YOUR CODE HERE
    	ring = new int[capacity];
    	frnt= 0;
    	back= 0 ;
    }

    // return the capacity of this ring buffer
    public int capacity() {
        // YOUR CODE HERE
    	return ring.length;
    }

    // return number of items currently in this ring buffer
    public int size() {
        // YOUR CODE HERE
    	int temp=0;
    	for(int i=0;i<ring.length;i++)
    	{
    		if(ring[i]!=0)
    			temp++;
    	}
    	return temp;
    }

    // is this ring buffer empty (size equals zero)?
    public boolean isEmpty() {
        // YOUR CODE HERE
    	return size() == 0;
    }

    // is this ring buffer full (size equals capacity)?
    public boolean isFull() {
        // YOUR CODE HERE
    	return size() == capacity();
    }

    // adds item x to the end of this ring buffer
    public void enqueue(double x) {
        // YOUR CODE HERE
    	if(isFull())
    	{
    		return;
    	}
    	if(back+1 == size() && frnt!=0)
    	{
    		
    	}
    	
    }

    // deletes and returns the item at the front of this ring buffer
    public double dequeue() {
        // YOUR CODE HERE
    	return 0.0;
    }

    // returns the item at the front of this ring buffer
    public double peek() {
        // YOUR CODE HERE
    	return 0.0;
    }

    // tests and calls every instance method in this class
    public static void main(String[] args) {
        // YOUR CODE HERE
    }

}

