package Sorting;

public class BubbleSort {
    static int swap;
    static int runo = 0;
    static int runi = 0;
    static int o = 0;
    static int i = 0;

    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            o++;

            for (int j = 0; j < arr.length - turn - 1; j++) {
                i++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
                runi++;
            }
            runo++;

        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 2, 7, 2, 3, 1, 7, 9 };
        bubbleSort(arr);
        print(arr);
        System.out.println("SWAPS= " + swap);
        System.out.println("outer run + inner run = " + runo + "+" + runi + " = " + (runo + runi));
        System.out.println("outer check + inner check = " + o + "+" + i + " = " + (o + i));
    }
}
