import java.util.Scanner;

public class test
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5-30 digit number: ");
        String num = scanner.nextLine();
        scanner.close();

        int totalOne = 0;
        
        for(int i = num.length()-1; i > 0 ; i-=2)
        {
            char temp = (num.charAt(i-1));
            //System.out.println(temp + "*2");          
        
            if (((temp - '0')*2) > 9) {
                totalOne += (((temp - '0')*2)-9);
              } else {
                totalOne += ((temp - '0')*2);
              }

            //System.out.println(totalOne);          
        }

        int totalTwo = 0;

        for(int i = num.length(); i > 0; i-=2)
        {
            char temp = (num.charAt(i-1));
            totalTwo += temp - '0';
        }
        
        if((totalOne+totalTwo)%10==0)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        
    }
}
