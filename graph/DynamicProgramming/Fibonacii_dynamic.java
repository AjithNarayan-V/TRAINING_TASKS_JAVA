public class Fibonacii_dynamic {
    int BottomUpApproach(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    int TopDownApproach(int mem[], int n) {
        if (mem[n] == 0) {
            if (n < 2) {
                mem[n] = n;
            } else {
                mem[n] = TopDownApproach(mem, n - 1) + TopDownApproach(mem, n - 2);
            }
        }
        return mem[n];
    }

    public static void main(String args[]) {
        Fibonacii_dynamic ob = new Fibonacii_dynamic();
        int n = 6;
        int[] mem = new int[n + 1];
        System.out.println("Top-down approach:");
        System.out.println(ob.TopDownApproach(mem, n));
        System.out.println("Bottom-up approach:");
        System.out.println(ob.BottomUpApproach(n));
    }
}
