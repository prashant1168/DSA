package Sorting;

public class Quicksort {
    public int partition(int arr[], int low, int high) {
        int pivoit = high;
        int i = low;
        int j = low;
        while (i <= high) {
            if (arr[i] <= arr[pivoit]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
            i++;
        }
        return j - 1;
    }

    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Quicksort q = new Quicksort();
        int arr[] = { 4, 3, 6, 1, 8, 9, 0 };
        System.out.println("before");
        q.print(arr);
        q.quickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("after");
        q.print(arr);

    }
}