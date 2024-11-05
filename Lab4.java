import java.util.Scanner;

public class cs210lab4mod
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many words: ");
        int size = scanner.nextInt();
        scanner.close();

        String[] array = new String[size];

        for (int i = 0; i < size; i++) 
        {
            System.out.println("Enter the word at pos: " + (i + 1));
            array[i] = scanner.next();
        }

        System.out.println("Unsorted array: ");
        printArray(array);
        sort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }

    public static void sort(String[] arr) 
    {
        boolean swapped;

        for (int i = 0; i < arr.length; i++)
        {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j].length() != arr[j + 1].length()) 
                {
                    if (arr[j].length() > arr[j + 1].length()) 
                    {
                        String temp;
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                } 
                else 
                {                   
                    if (arr[j].compareTo(arr[j + 1]) > 0) 
                    {
                        String temp;
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (!swapped) 
            {
                break;
            }
        }
    }

    public static void printArray(String[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
