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
	private double[] ring;
	int frnt,back,size;
    // You are creating a circular queue.
    // Look up how to create a cirucular queue using an array.

    //must use and array   []

    // creates an empty ring buffer with the specified capacity
    public RingBuffer(int capacity) {
        // YOUR CODE HERE
    	ring = new double[capacity];
    	for(int i=0;i<ring.length;i++)
    	{
    		ring[i]=Double.MIN_VALUE;
    	}
    	size=capacity
    	frnt= -1;
    	back= -1;
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
    	for(int i=frnt;i<back;i++)
    	{
    		temp++;
    		if(i==)
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
    	if(size()==0)
    	{
    		frnt=0;
    		back=0;
    		ring[0]=x;
    	}
    	else if(back+1 == size() && frnt!=0)
    	{
    		back=0;
    		ring[0]=x;
    	}
    	else
    	{
    		back++;
    		ring[back+1]=x;
    	}
    }

    // deletes and returns the item at the front of this ring buffer
    public double dequeue() {
    	double temp = ring[frnt];
    	ring[frnt]=Double.MIN_VALUE;
    	return temp;
    }

    // returns the item at the front of this ring buffer
    public double peek() {
        // YOUR CODE HERE
    	return ring[frnt];
    }
   

    // tests and calls every instance method in this class
    public static void main(String[] args) {
        // YOUR CODE HERE
    }

}

