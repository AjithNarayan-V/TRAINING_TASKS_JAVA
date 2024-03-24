import java.util.*;
import java.util.ArrayList;


public class Collectionsqw {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        
        
        Iterator<Integer> iterator =list.iterator();  
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(iterator.hasNext()){
                
            int next = iterator.next();
            if(next<min){
                min=next;
                System.out.println(min);
            }
            if(next>max){
                max=next;
            }

        }        
        System.out.println(list);
        System.out.println("Min:"+min+" Max:"+max);
    }
}