import java.util.Stack;

public class ArrayRevrseStak {
     String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
         stack.push(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
        
    }
    Boolean reverse(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        ArrayRevrseStak r = new ArrayRevrseStak();
        String input="malayalam";
        String rsult=r.reverse(input);
        System.out.println(rsult.equals(input));
    }
    
}
