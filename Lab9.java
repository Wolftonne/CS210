import java.util.Scanner;
import java.util.Random;

public class lab9 {
    public static void merge(int[] workSpace, int first, int second, int upperBound) {
        int n1 = second - first + 1; // sizes of the two arrays
        int n2 = upperBound - second;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = workSpace[first + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = workSpace[second + 1 + j];
        }

        //merge the temp arrays
        int i = 0, j = 0;
        int k = first;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                workSpace[k] = L[i];
                i++;
            } else {
                workSpace[k] = R[j];
                j++;
            }
            k++;
        }
        //copy any remaining elements of L[] if any
        while (i < n1) {
            workSpace[k] = L[i];
            i++;
            k++;
        }

        //copy remaining elements of R[] if any
        while (j < n2) {
            workSpace[k] = R[j];
            j++;
            k++;
        }
    }

    //function that sorts workSpace[first...second] using merge()
    public static void sort(int workSpace[], int first, int second) {
        if (first < second) {
            //find middle
            int mid = first + (second - first) / 2;

            //sort first and second halves using insertion sort if subsection size < 9
            if ((second - first + 1) < 9) {
                insertionSort(workSpace, first, second);
            } else {
                sort(workSpace, first, mid);
                sort(workSpace, mid + 1, second);
                merge(workSpace, first, mid, second);
            }
        }
    }

    public static void insertionSort(int arr[], int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= start && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int size = 500;
        int arr[] = new int[size]; //create array of size 500

        //populate array with 500 random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(200);
        }
        sort(arr, 0, size - 1);

        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
