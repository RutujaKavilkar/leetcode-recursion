import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();

        solve(0, arr, target, new ArrayList<>(), ans);

        System.out.println(ans);
    }

    public static void solve(int index, int[] arr, int target,
                             List<Integer> ds, List<List<Integer>> ans) {

        // base case
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // TAKE
        if (arr[index] <= target) {
            ds.add(arr[index]);
            solve(index, arr, target - arr[index], ds, ans); // SAME INDEX
            ds.remove(ds.size() - 1); // BACKTRACK
        }

        // NOT TAKE
        solve(index + 1, arr, target, ds, ans);
    }
}