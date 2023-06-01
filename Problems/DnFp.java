package Problems;

public class DnFp {
    public void sort(int arr[], int temp[]) {
        int zs = 0;
        int os = 0;
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                temp[arr[i]] = ++zs;
            } else if (arr[i] == 1) {
                temp[arr[i]] = ++os;
            } else if (arr[i] == 2) {
                temp[arr[i]] = ++ts;
            }
        }
    }
}
