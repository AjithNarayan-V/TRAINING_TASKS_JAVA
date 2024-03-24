//COMPLITED (FINDINGG FREQUENCE IN ARRAY)
import java.util.Arrays;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {80, 81, 82, 83, 84, 85, 86, 87, 88,80, 81, 82, 83, 84, 85, 86, 87, 88};
        int n = arr.length;
        Arrays.sort(arr);
        int start=arr[0];
        int[] freq = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = arr[i]-start;
        }

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (freq[i] > 0) {
               System.out.println((i+start)+"-"+ freq[i]);
            } 
        }
        
       
    }
}