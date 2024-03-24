import java.lang.reflect.Array;
import java.util.Arrays;

public class dutchflag {
    public void sortColors(int[] nums) {
        int arr[]=new int[nums.length];
       int pos=0;
       int val=0;
       while(true){
           if(3<val){
               break;
           }
           for(int i=0;i<nums.length;i++){
               if(nums[i]==val){
                   arr[pos]=nums[i];
                   pos++;
               }   
           }
           val++;
       }
       System.out.println(Arrays.toString(arr));

   }
    public static void main(String[] args) {
        dutchflag d=new dutchflag();
        int nums[]={2,0,2,1,1,0};
        d.sortColors(nums);
        
        // int arr[]=new int[nums.length];
        // int pos=0;
        // int val=0;
        // while(true){
        //     if(val==3){
        //         break;
        //     }
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]==val){
        //             arr[pos]=nums[i];
        //             pos++;
        //         }   
        //     }
        //     val++;
        // }
        // System.out.println(Arrays.toString(arr));

        
    }
}
