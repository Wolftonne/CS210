//CODE ONLY WORKS FOR DIGITS 5-10.... NOT SURE WHY

import java.util.Scanner;

class Lab1
{
    
    public static void main(String[]args)
    {
        //Take in number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5-10 digit number: ");
        long num = scanner.nextInt();
        scanner.close();
        

        long exp = 0;
        long expTwo = 0;

        //Check to see if number is odd or even. If even exponent is num-1. If odd exponent is num-2. 
        if(String.valueOf(num).length()%2==0)
        {
            exp = (String.valueOf(num).length())-1;
        }
        else if(String.valueOf(num).length()!=0)
        {
            exp = (String.valueOf(num).length())-2;
        }

        System.out.println("Every 2nd digit right-left");
        //This loop checks where the second digit from right to left is. It uses 10 to the power of the exponent found above to remove the digit to the right of any given (second digit)
        //It also doubles each value and checks if the doubled value is > 9. If yes then it minus 9, if no then it stays doubled.
        //It also creates a variable called sum and sums together each output. This is used later
        
        long sum = 0;

        for(int i = 10; i <= Math.pow(10,exp); i *= 100)
        {
            long temp = ((num/i)%10); 
            if(temp*2 > 9)
            {
                temp = (temp*2)-9;
                System.out.println(temp);
                sum += temp;
                
            }
            else
            {
                temp = temp * 2;
                System.out.println(temp);  
                sum += temp;
                           
            }
                                
        }

        System.out.println();
        System.out.println("Sum: " + sum);      
        System.out.println();




        //The following if statement and for loop does the same as the ones above. Except gets the first digit from right to left instead of the second
        //It sums together each value that is printed. This is used to combine with the 2nd last right to left digits.

        if(String.valueOf(num).length()%2==0)
        {
            expTwo = (String.valueOf(num).length())-2;
        }
        else if(String.valueOf(num).length()!=0)
        {
            expTwo = (String.valueOf(num).length())-1;
        }


        long sumTwo = 0;

        System.out.println("Every 1st digit right-left");
        for(int i = 1; i <= Math.pow(10,expTwo); i *= 100)
        {
            long tempTwo = ((num/i)%10);     
            System.out.println(tempTwo);
            sumTwo += tempTwo;       
        }

        System.out.println("Sum Two: " + sumTwo);

        //Adds sum of 2nd last digits (R-L) and 1st last digits (R-L) together. If %10==0 then valid and if %10!=0 then invalid.

        long totalSum = sum+sumTwo;
        System.out.println("Total Sum: " + totalSum);
        if(totalSum%10==0)
        {
            System.out.println("VALID");
        }
        else
        {
            System.out.println("INVALID");
        }

       
        


        

    }
}
