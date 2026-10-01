import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        printOne(0, arr, new ArrayList<>(), 0, k);
    }

    public static boolean printOne(int index, int[] arr, List<Integer> ds, int sum, int k) {

        // base case
        if (index == arr.length) {
            if (sum == k) {
                System.out.println(ds);
                return true;   // FOUND → stop
            }
            return false;
        }

        // TAKE
        ds.add(arr[index]);
        sum += arr[index];

        if (printOne(index + 1, arr, ds, sum, k) == true) {
            return true;   // propagate TRUE upward
        }

        // BACKTRACK
        sum -= arr[index];
        ds.remove(ds.size() - 1);

        // NOT TAKE
        if (printOne(index + 1, arr, ds, sum, k) == true) {
            return true;
        }

        return false;  // not found in both paths
    }
}