package Sorting;

public class Mergesort {
    public void Sort(int arr[], int temp[], int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            Sort(arr, temp, low, mid);
            Sort(arr, temp, mid + 1, high);
            mergeSort(arr, temp, low, mid, high);
        }
    }

    public void mergeSort(int arr[], int temp[], int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Mergesort m1 = new Mergesort();
        int arr[] = { 7, 3, 2, 6, 9, 9, 8, 1, 2, 3, 9, 0 };
        m1.Sort(arr, new int[arr.length], 0, arr.length - 1);
        m1.print(arr);
    }
}
