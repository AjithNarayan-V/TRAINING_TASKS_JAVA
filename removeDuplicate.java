//(USIING FREQUENCY TABLE try this) AND (BRUTE FORCE METHOD THAT IS NESTED FOR LOOP)

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 8, 2, 4,2,3,1,1,3,1,2,1,3,3, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1){
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length;i++) {
            if(arr[i]!=-1){
                System.out.println(arr[i]);         
                
            }
        }
    }

}
