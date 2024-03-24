import java.util.*;

public class missingValue {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 8, 2, 3, 1 };
        int n = arr.length;
        Arrays.sort(arr);
        int min = arr[0];
        int max= arr[n-1];
        int freq[] = new int[max];
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] != min) {
                System.out.println("missing: " + min);
                freq[min]++;
                min++;
                i = i - 1;
                continue;
            }
            while (min < max) {
                if (arr[i + 1] != min) {
                    continue;
                } 
                System.out.println("aef");
            }
            min++;


            // System.out.println(list);

        }
        for (int i = 0; i < max; i++) {
            if (freq[i] == 1) {
               System.out.println("he"+i);
            } 
        }
    }
}
