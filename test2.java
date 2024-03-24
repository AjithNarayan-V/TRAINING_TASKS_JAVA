

public class test2 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (char c : s.toCharArray()) {//  rlrrllrlrl
            if (c == 'L') {
                balance++;
            }
            else if (c == 'R') {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        test2 solution = new test2();
        String s1 = "RLRRLLRLRL";
        String s2 = "RLLLLRRRLR";
        String s3 = "LLLLRRRR";
       
        System.out.println(solution.balancedStringSplit(s1)); // Output: 4
        System.out.println(solution.balancedStringSplit(s2)); // Output: 3
        System.out.println(solution.balancedStringSplit(s3)); // Output: 1
    }
}