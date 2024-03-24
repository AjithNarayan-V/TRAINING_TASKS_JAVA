import java.util.HashSet;
import java.util.Set;

public class STR_LENNGTH {
    public static String findString(int n, int k) {
        StringBuilder ans = new StringBuilder("0");
        k -= 1;
        Set<String> visited = new HashSet<>();
        visited.add("0");
        while (visited.size() < Math.pow((k + 1), n)) {
            String previous = ans.substring(ans.length() - n + 1);
            for (int i = k; i >= 0; i--) {
                String currStr = previous + i;
                if (!visited.contains(currStr)) {
                    visited.add(currStr);
                    ans.append(i);
                    break;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 2;
        String result = findString(n, k);
        System.out.println("Lexicographically smallest string: " + result);
    }
}
