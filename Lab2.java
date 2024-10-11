package cs210lab2;

import java.util.Scanner;

public class cs210lab2 
{
	public static void main(String[]args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 2<=n<=10: ");
		long num = scanner.nextLong();
		scanner.close();
		
		while(num != 1) // loops until number is 1
		{
			if(num%2==0) // even number
			{
				num = evenCheck(num);
			}
			else if(num%2!=0) // odd number
			{
				num = oddCheck(num);
			}
			
			System.out.println(num);	
							
		}		
	}
	
	public static long evenCheck(long x) // method for dealing with even numbers
	{
		x = x/2;
		return x;
	}
	
	public static long oddCheck (long x) // method for dealing with odd numbers
	{
		x = (x*3)+1;
		return x;
	}
}
