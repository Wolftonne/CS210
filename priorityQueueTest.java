import java.util.Scanner;

public class priorityQueueTest
{
    public static void main(String[] args)
    {       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of queue: ");
        int size = scanner.nextInt();
        priorityQueue q1 = new priorityQueue(size);

        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter value at pos " + (i+1));
            q1.insert(scanner.nextLong());
        }

        q1.remove();
        

        System.out.println();
        while(!q1.isEmpty())
        {
            System.out.println(q1.remove());
        }
    }
}
