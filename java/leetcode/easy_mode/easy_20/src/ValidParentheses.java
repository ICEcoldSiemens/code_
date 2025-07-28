/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true*/

import java.util.Stack;

public class ValidParentheses {

    static boolean isValidParenthesesAttemptOne(String input){
        Stack<Character> parentheses = new Stack<>();

        if(input.length() == 1) return false;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['){
                parentheses.push(input.charAt(i));
            } else {if(parentheses.isEmpty()) return false;}

            if(input.charAt(i) == ')' && parentheses.pop() != '('){
                    return false;}
            if(input.charAt(i) == '}' && parentheses.pop() != '{'){
                return false;
            }
            if(input.charAt(i) == ']' && parentheses.pop() != '['){
                return false;
            }
        }
            return parentheses.isEmpty();
            }

    public static void main(String[] args){
        String s = "]";
        boolean validParentheses = isValidParenthesesAttemptOne(s); // 4 milliseconds with a time complexity of O(n)
        System.out.println(validParentheses);
    }
}
