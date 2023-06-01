public class Recursion {
    public static void Dec(int n) {
        if (n < 0)
            return;
        System.out.println(n);
        Dec(n - 1);

    }

    public static void inc(int n) {
        if (n < 0)
            return;
        inc(n - 1);
        System.out.print(n + "--");
    }

    public static int fact(int n) {
        if (n == 0)
            // System.out.println(1);
            return 1;
        return n * fact(n - 1);
    }

    public static int Natural(int n) {
        if (n == 1)
            return 1;

        return n + Natural(n - 1);

    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        int t = fib(n - 1) + fib(n - 2);
        return t;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i > arr.length) {
            return false;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    public static void main(String args[]) {
        // Dec(111);
        // inc(10);
        // System.out.print(fact(5));
        // System.out.println(Natural(10));
        // System.out.println(fib(2));
        // fib(3);
        // int arr[] = { 1, 2, 3, 4, 5 };
        // System.out.println(isSorted(arr, 0));
    }
}
