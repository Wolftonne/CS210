public class selectionSort
{
    public static void main(String[]args)
    {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: ");
        printArray(arr);
        selectionSortMethod(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }


    public static void selectionSortMethod(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            //Assume the current 'i' holds the min element
            int min = i;

            //Iterate through the array to find the actual min
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    //Update min if a smaller is found
                    min = j;
                }
            }

            // Move min element to correct pos
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
