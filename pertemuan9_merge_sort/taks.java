package pertemuan9_merge_sort;
import java.util.Scanner;

public class taks {
    
    /* Function to merge the subarrays of a[] */
    void merge(String a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        /* temporary Arrays */
        String LeftArray[] = new String[n1];
        String RightArray[] = new String[n2];

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg; /* initial index of merged sub-array */

        while (i < n1 && j < n2) {
            if (LeftArray[i].compareTo(RightArray[j]) <= 0) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }

    void mergeSort(String a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    /* Function to print the array */
    void printArray(String a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        String a[] = new String[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }

        taks m1 = new taks();
        System.out.println("\nBefore sorting, the array elements are:");
        m1.printArray(a, n);
        m1.mergeSort(a, 0, n - 1);
        System.out.println("\nAfter sorting, the array elements are:");
        m1.printArray(a, n);
        System.out.println("");
    }
}

