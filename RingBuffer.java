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
	int frnt,back,sizef,size;
    // You are creating a circular queue.
    // Look up how to create a cirucular queue using an array.

    //must use and array   []

    // creates an empty ring buffer with the specified capacity
    public RingBuffer(int capacity) {
        // YOUR CODE HERE
    	ring = new double[capacity];
    	
    	size=capacity;
    	frnt= 0;
    	back= 0;
    	sizef=0;
    }

    // return the capacity of this ring buffer
    public int capacity() {
        // YOUR CODE HERE
    	return ring.length;
    }

    // return number of items currently in this ring buffer
    public int size() {
        // YOUR CODE HERE
    	return sizef;
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
    	if(back==size)
    	{
    		back=0;
    	}
    	ring[back]=x;
    	
    	back++;		
    	sizef++;
    	
    }

    // deletes and returns the item at the front of this ring buffer
    public double dequeue() {
    	double temp = ring[frnt];
    	ring[frnt]=Double.MIN_VALUE;
    	sizef=sizef-1;
    	frnt++;
    	return temp;
    	
    }

    // returns the item at the front of this ring buffer
    public double peek() {
        // YOUR CODE HERE
    	return ring[frnt];
    }
    
    public String toString()
    {
    	
    	String temp="[";
    	int temp1=sizef;
    	for(int i=frnt;i!=back||temp1!=0;i++)
    	{
    		
    		if(i==size)
    		{
    			i=0;
    		}
    		if(i==back-1){
    			temp+=ring[i];
    		}
    		else
    		{
    			temp+=ring[i] +", ";
    		}
    		temp1=temp1-1;
    		
    	}
    	temp+="]";
    	return temp;
    }

    

}
