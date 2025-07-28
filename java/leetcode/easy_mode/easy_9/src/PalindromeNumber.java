/*Given an integer x, return true if x is a palindrome, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1*/

import java.util.Arrays;

public class PalindromeNumber {

    public static boolean isPalindromeAttemptOne(int x){ // 6 milliseconds with a time complexity of O(n)
        String xStr = String.valueOf(x);
        String xStrReversed = new StringBuilder(xStr).reverse().toString();
        return xStr.equals(xStrReversed);

    }

    public static boolean isPalindromeAttemptTwo(int x){ // 7 milliseconds with a time complexity of O(n)
        String xStr = String.valueOf(x);
        char[] xStr_items = new char[xStr.length()];

        for(int i = 0; i < xStr.length(); i++){
            xStr_items[i] = xStr.charAt(xStr.length() - i - 1);
        }

        return Arrays.equals(xStr.toCharArray(), xStr_items);
    }

    public static void main(String[] args) {
           int q = 315;
           boolean isPalindrome = isPalindromeAttemptOne(q);

           if(isPalindrome){
               System.out.println("This number is a palindrome number");
           }

           else{
               System.out.println("This number is not a palindrome number");
           }
    }
}
