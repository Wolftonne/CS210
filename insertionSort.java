public class insertionSort
{
    public static void main(String[]args)
    {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original array: ");
        printArray(arr);
        insertionSortMethod(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void insertionSortMethod(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            //Move elements of arr[0..i-1], that are greater than key
            //to one pos of their current pos

            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
