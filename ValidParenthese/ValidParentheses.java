
//this class is used for learning stack data structure
import java.util.Stack;

class ValidParentheses{
    public static void main (String[] args){

        String s = "{()}";

        //creating a new stack
        Stack<Character> stack = new Stack<Character>();

        //System.out.println(s.charAt(0));

        for(int i = 0 ; i < s.length(); i++){

            //when loop to the left parentheses, push in to the stack.
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                System.out.println("char is pushed in here");
            }
            //if what we encountered is ')', check the stack if we got '('
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(' ){
                stack.pop();
            }
            //if what we encountered is '}', check the stack if we got '{'
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{' ){
                stack.pop();
            }
            //if what we encountered is ']', check the stack if we got '['
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[' ){
                stack.pop();
            }
            else{
                System.out.println("False");
            }
    }

    System.out.println(stack.isEmpty());
}


}