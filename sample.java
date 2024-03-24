import java.util.*;

public class sample {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,2,3,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                System.out.println("missing: " + min);
                list.add(min);
                min++;
            } else {
                min++;
            }
        }
        
        // Check for missing elements up to the maximum value in the array
        while (min <= arr[arr.length - 1]) {
            System.out.println("missing: " + min);
            list.add(min);
            min++;
        }

        System.out.println(list);
    }
}
