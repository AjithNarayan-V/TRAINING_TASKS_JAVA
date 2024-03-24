import java.util.Stack;

class deleteMe {
    public boolean isValid(String s) {
        char arr[]=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:arr){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){y
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
		deleteMe solution =new deleteMe();
		System.out.println( solution.isValid("()"));
	}
}
