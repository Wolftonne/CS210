import java.util.Stack;
import java.util.Scanner;

public class stacks
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        //Create a new stack
        Stack<String> stack = new Stack<>();

    

        
        while(!stack.contains("Arrived"))
        {
            stack.push(scanner.next());
        }
        System.out.println(stack);

       
    }
}
