import java.util.*;
// MISSING VALUE BACKUP
public class missingValue {
    public static void main(String[] args) {
        int[] arr = {4,3,8,2,3,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min=arr[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                System.out.println("missing:"+min);
                list.add (min); 
                min++;
                i=i-1;
                continue;
            }
            try {
                if(arr[i+1]==min && min <= arr[arr.length - 1]) {
                    continue;
                }
                
            } catch (Exception e) {
                // TODO: handle exception
            }
            
            min++;
        }
        System.out.println(list);

    }
}







// public class frequency {
//     public static void main(String[] args) {
//         int[] arr = {2, 2, 3, 3, 3, 4, 4, 4, 4};
//         int n = arr.length;
//         int i;
//         int[] freq = new int[n];
        
//         for ( i = arr[0]-1; i < n; i++) {
//             freq[arr[i]]++;
//         }
        
//         for (i = arr[0]-1; i < n; i++) {
//             if (freq[i] > 0) {
//                System.out.println(i +"-"+ freq[i]);
//             } 
//         }
        
       
//     }
// }







