package Sorting;

public class Merge2S {
    public void MergeTwoSorted(int arr1[], int arr2[]) {
        int result[] = new int[arr1.length + arr2.length];
        int i1 = 0;
        int j2 = 0;
        int kr = 0;
        while (i1 < arr1.length && j2 < arr2.length) {
            if (arr1[i1] < arr2[j2]) {
                result[kr] = arr1[i1];
                i1++;
            } else {
                result[kr] = arr2[j2];
                j2++;
            }
            kr++;
        }
        while (i1 < arr1.length) {
            result[kr] = arr1[i1];
            i1++;
            kr++;
        }
        while (j2 < arr2.length) {
            result[kr] = arr2[j2];
            j2++;
            kr++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    // public void print() {
    // for (int i = 0; i < result.length; i++) {
    // System.out.print(result[i] + " ");
    // }
    // }

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 0, 2, 4, 6, 8 };
        // int result[] = new int[arr1.length + arr2.length];
        Merge2S m1 = new Merge2S();
        m1.MergeTwoSorted(arr1, arr2);
        // m1.print();
    }

}
