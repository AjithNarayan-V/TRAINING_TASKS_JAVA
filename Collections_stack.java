import java.util.Stack;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayDeque;
public class Collections_stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque();
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,5));
        System.out.println(list);
        for(int i:list){
            stack.push(i);
        }
        while(!stack.isEmpty()){

            System.out.println(stack.pop());  
        }
        
    //     System.out.println(stack.size());
    //    for(int i=0;i<list.size();i++){
    //     // System.out.println("s");
    //      System.out.println(stack.pop());  
    //    }
    }
}

