package Sorting;

public class Bubblesoer2 {
    boolean isSwaped;
    int swap = 0;
    int runo = 0;
    int runi = 0;
    int o = 0;
    int in = 0;

    public void buBBlesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwaped = false;
            o++;
            for (int j = 0; j < n - 1 - i; j++) {
                in++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwaped = true;
                    swap++;

                }
                runi++;
            }
            if (isSwaped == false) {
                break;
            }
            runo++;
        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 2, 7, 2, 3, 1, 7, 9 };
        Bubblesoer2 bs = new Bubblesoer2();
        System.out.println("before b sort: ");
        bs.print(arr);
        bs.buBBlesort(arr);
        System.out.println(" ");
        System.out.println("after b sort: ");
        bs.print(arr);
        System.out.println("swaps: " + bs.swap);
        System.out.println("outer run + inner run = " + bs.runo + "+" + bs.runi + " = " + (bs.runo + bs.runi));
        System.out.println("outer check + inner check = " + bs.o + "+" + bs.in + " = " + (bs.o + bs.in));
    }
}
