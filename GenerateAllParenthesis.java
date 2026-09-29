import java.util.*;

public class Main {

    public static void main(String[] args) {

        int n = 3;

        List<String> result = generateParenthesis(n);

        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve("", 0, 0, n, ans);

        return ans;
    }

    public static void solve(String curr, int open, int close, int n, List<String> ans) {

        // ✅ Base case
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        // ✅ Try adding '('
        if (open < n) {
            solve(curr + "(", open + 1, close, n, ans);
        }

        // ✅ Try adding ')'
        if (close < open) {
            solve(curr + ")", open, close + 1, n, ans);
        }
    }
}