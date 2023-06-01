package Problems;

public class DutchNfP {
    public void sort(int arr[]) {
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }
            if (arr[i] == 1) {
                i++;
            }
            if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;

            }

        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        DutchNfP d1 = new DutchNfP();
        int arr[] = { 1, 2, 2, 0, 2, 2, 1, 1, 0, 0, 0, 1, 2 };
        d1.sort(arr);
        d1.print(arr);

    }
}
