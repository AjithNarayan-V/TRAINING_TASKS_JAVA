import java.util.Stack;

class paranthisis_matching {


  
    public boolean isValid(String s) {
        char arr[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:arr){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
					return false;
				}
                 switch(c){

                    case ')':
                        if(stack.peek()=='(')
                        {
                            stack.pop();    
                        }
                        else{
                        
                            stack.push(')');
						}
						break;
                        
                     case ']':
                        if(stack.peek()=='[')
                        {
                            stack.pop();
                        }
                        else
                        {
                            stack.push(']');
                        }
						break;

                     case '}':
                        if(stack.peek()=='{')
                        {
                            stack.pop();
                        }
                        else
                        {
                            stack.push('}');
                        }
						break;
                }
                
            }

            
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }
        
    }
	public static void main(String[] args) {
		paranthisis_matching solution =new paranthisis_matching();
		System.out.println( solution.isValid("([)]"));
	}
}



// import java.util.HashMap;

// class DeleteMe {
//     private static final HashMap<Character, Character> symbolMap = new HashMap<>();
//     static {
//         symbolMap.put(')', '(');
//         symbolMap.put(']', '[');
//         symbolMap.put('}', '{');
//     }

//     public boolean isValid(String s) {
//         StringBuilder stack = new StringBuilder();

//         for (char c : s.toCharArray()) {
//             if (symbolMap.containsValue(c)) { // Opening symbol
//                 stack.append(c);
//             } else if (symbolMap.containsKey(c)) { // Closing symbol
//                 if (stack.length() == 0 || stack.charAt(stack.length() - 1) != symbolMap.get(c)) {
//                     return false; // Mismatched symbols
//                 }
//                 stack.deleteCharAt(stack.length() - 1); // Remove the matching opening symbol
//             } else {
//                 return false; // Invalid character
//             }
//         }

//         return stack.length() == 0; // All opening symbols are matched
//     }

//     public static void main(String[] args) {
//         DeleteMe solution = new DeleteMe();
//         System.out.println(solution.isValid("()")); // Output: true
//         System.out.println(solution.isValid("([)]")); // Output: false
//     }
// }
