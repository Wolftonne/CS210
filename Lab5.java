import java.util.Scanner;
import java.util.Stack;

public class cs210lab5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        // Define allowed inputs
        String[] allowedInputs = {"Go North", "Go East", "Go West", "Go South", "Go Back", "Arrived"};
        
        // Main loop
        while (true) 
        {            
            String input = scanner.nextLine();

            // Break loop if user types "exit"
            if (input.equalsIgnoreCase("Arrived")) 
            {
                break;
            }



           

            // Check if the input is in the list of allowed inputs
            boolean isAllowed = false;
            for (String allowed : allowedInputs) 
            {
                if (input.equalsIgnoreCase(allowed)) 
                {
                    isAllowed = true;
                    break;
                }
            }

            // Add to stack if allowed, otherwise show error message
            if (isAllowed) 
            {
                stack.push(input);    
                if(input.equals("Go Back"))
                {
                    stack.pop();
                    if(!stack.isEmpty())
                    {
                        stack.pop();
                    }
                }            
            } 
            else 
            {
                System.out.println("Invalid input.");
            }
        }
        
        System.out.println(stack);
        scanner.close();
    }

    

   
}
