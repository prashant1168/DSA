package Problems;

public class SquareSorted {
    public void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        SquareSorted s1 = new SquareSorted();
        int arr[] = { -10, 0, 1, 2, 3, 4 };
        s1.square(arr);
        s1.print(arr);
    }
}
