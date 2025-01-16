package Stack;
/*
* Create a empty stack, which will allows us FILO
* Traverse the string and push the opening brackets in the stack
* When closing brackets comes, match that with the peek element from the stack. If that matches remove the element from the stack
* If the stack get empty at the end, that means there is a valid parenthesis.
 */

public class ValidParenthesis {

    public boolean isValid(String s) {
        //create a empty stack
        Stack<Character> stack = new Stack<>();

        //iterate through the characters in the string
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                //if stack is empty or the top of the stack doesn't matches
                if(stack.isEmpty()){
                    return false;
                }

                //remove the top of the stack and match with the closing brack
                char top = stack.pop();
                //check the top of the stack matches the corresponding closing bracket
                if((s.charAt(i)==')' && top!='(') || (s.charAt(i)=='}' && top!='{') || (s.charAt(i)==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
