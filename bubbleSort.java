public class bubbleSort
{
    public static void main(String[]args)
    {      
        long start = System.currentTimeMillis();       

        int[]array = {21, 233, 1, 55, 87, 34, 12, 13, 4, 23, 13, 15, 122, 542};
        sort(array);

        long elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed);
    }

    public static int[] sort(int[]array)
    {
        boolean swapped;

        for(int i = 0; i < array.length-1; i++)
        {
            swapped = false;
            for(int j = 0; j < array.length - i - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    int temp;
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");            
        }
        System.out.println();
        return array;
    }
}
