import java.util.Scanner;

public class Lab9 {
    public static void merge(int[] workSpace, int first, int second, int upperBound) {
        int n1 = second - first + 1; // sizes of the two arrays
        int n2 = upperBound - second;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for(int i = 0; i < n1; i++) {
            L[i] = workSpace[first+i];
        }
        for(int j = 0; j < n2; j++) {
            R[j] = workSpace[second + 1 + j];
        }
        
        //merge the temp arrays
        //inital indices of first and second subarrays
        int i = 0, j = 0;

        //initial index of merged subarray array
        int k = first;
        while(i < n1 && j < n2) {
            if(L[i] <= R[j]) {
                workSpace[k] = L[i];
                i++;
            } else {
                workSpace[k] = R[j];
                j++;
            }
            k++;
        }
        //copy any remaining elements of L[] if any
        while(i < n1) {
            workSpace[k] = L[i];
            i++;
            k++; 
        }

        //copy remaining elems of R[] if any
        while(j < n2) {
            workSpace[k] = R[j];
            j++;
            k++;
        }        
    }

    //function that sorts workSpace[first...second] using merge()
    public static void sort(int workSpace[], int first, int second) {
        if(first < second) {
            //find middle
            int mid = first + (second - first) / 2;

            //sort first and second halves
            sort(workSpace, first, mid);
            sort(workSpace, mid + 1, second);
            //merge the sorted halves
            merge(workSpace, first, mid, second);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        
        for(int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        sort(arr, 0, size-1);
        System.out.print("[");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if(i < size - 1) {
                System.out.print(", ");
            }
        }  
        System.out.print("]");
    }
}
