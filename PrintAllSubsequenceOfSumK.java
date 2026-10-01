import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        printSubsequence(0, arr, new ArrayList<>(), 0, k);
    }

    public static void printSubsequence(int index, int[] arr, List<Integer> ds, int sum, int k) {

        // base case
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(ds);
            }
            return;
        }

        // TAKE
        ds.add(arr[index]);
        sum += arr[index];

        printSubsequence(index + 1, arr, ds, sum, k);

        // BACKTRACK
        sum -= arr[index];
        ds.remove(ds.size() - 1);

        // NOT TAKE
        printSubsequence(index + 1, arr, ds, sum, k);
    }
}