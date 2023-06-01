package Sorting;

public class Insertionsort {
    public void insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = temp;
        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Insertionsort in = new Insertionsort();
        int arr[] = { 9, 7, 4, 1, 2, 6, 7, 8, 9 };
        in.insertSort(arr);
        in.print(arr);
    }
}
