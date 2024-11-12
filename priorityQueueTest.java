//import java.util.Queue;

public class priorityQueueTest
{
    public static void main(String[] args)
    {
        priorityQueue q1 = new priorityQueue(10); // make new p queue
        q1.insert(60); // slot items into queue
        q1.insert(20);
        q1.insert(80);
        q1.insert(40);
        while(!q1.isEmpty())
        {
            System.out.println(q1.remove());
        }        
    }
}
