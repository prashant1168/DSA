package Sorting;

public class Selectionsort {
    public void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        Selectionsort s1 = new Selectionsort();
        int arr[] = { 6, 1, 3, 9, 5, 3, 45, 56, 7, 5, 4, 9 };
        s1.selectionSort(arr);
        s1.print(arr);
    }
}
