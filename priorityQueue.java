public class priorityQueue
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public priorityQueue(int s) // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long item) //method to insert
    {
        if(nItems == 0)
        {
            queArray[0] = item;
        }
        else
        {
            int j = nItems;
            
            while (j > 0 && queArray[j-1] > item)
            {
                queArray[j] = queArray[j-1];
                j--;
            }
            queArray[j] = item;
        }
        nItems++;
    }

    public boolean isEmpty() //method to check if empty
    {
        return nItems == 0;
    }

    public long remove() //method to remove item
    {
        
        long temp = queArray[--nItems];
        return temp;
       
    }

    public long peek() //method to view top item without removing it
    {
        long temp =  queArray[nItems-1];
        return temp;
    }

    public boolean isFull() // return true if queue is full
    {
        return(queArray[nItems-1] == maxSize-1);
    }

    public long size() // returns current size (number of items)
    {
        long temp = nItems;
        return temp;
    }
}
