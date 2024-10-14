import java.util.Scanner;

public class cs210lab3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Enter the nth prime number you want to find: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;    
        int num = 8000;    

        for(int i = 2; i <= num ; i++)
        {
            boolean isPrime = true;

            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }                
            }

            if(isPrime)
            {
                
                count++;
                if(count == n)
                {
                    System.out.println(i + " is the "+n+"th prime number");
                }
            }            
        }        
    }
}
