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

    public boolean isEmpty() //returns true if empty
    {
        return nItems == 0;
    }

    public long remove() //method to remove item
    {
        if(!isEmpty())
        {
            long temp = queArray[--nItems];
            return temp;
        }
        else
        {
            throw new RuntimeException("Queue is empty");
        }
     }

    public boolean isFull() //returns true if full
    {
        return nItems == maxSize;
    }

    public long peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Queue is empty");
        }
        return queArray[0];
    }

    public int size()
    {
        return nItems;
    }

    public boolean compareTo(priorityQueue otherQueue)
    {
        if(this.size() != otherQueue.size())
        {
            return false;
        }
        for(int i = 0; i < this.size(); i++)
        {
            if(this.queArray[i] != otherQueue.queArray[i])
            {
                return false;
            }
        }
        return true;
    }
}
