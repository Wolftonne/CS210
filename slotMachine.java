import java.util.Random;

public class slotMachine
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        int rows = 3;
        int cols = 5;
        String[][] arr = new String[rows][cols];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j+=2)
            {
                int x = rand.nextInt(1,10);
                switch(x)
                {
                    case 1: case 2: case 3: case 4:
                        arr[i][j] = "Diamond";
                        break; 
                    case 5: case 6: case 7:
                        arr[i][j] = "Lemon";
                        break;
                    case 8: case 9: 
                        arr[i][j] = "Cherry";
                        break;
                    case 10:
                        arr[i][j] = "Bell";
                        break;

                }
            }

        }

        arr[0][1] = "|";
        arr[1][1] = "|";
        arr[2][1] = "|";

        arr[0][3] = "|";
        arr[1][3] = "|";
        arr[2][3] = "|";

        printArr(arr, rows, cols);
        System.out.println("---------------------");
        
    }


    public static void printArr(String[][] arr, int rows, int cols)
    {
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
