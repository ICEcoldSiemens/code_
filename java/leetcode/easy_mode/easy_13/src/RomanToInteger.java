/* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.*/

import java.util.HashMap;

public class RomanToInteger {

    public static int value(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void RomantoIntAttemptOne(String roman) {
        int ans = 0;

        // The current and next char indexes are held as loop executes
        for (int i = 0; i < roman.length(); i++) {
            int curr = value(roman.charAt(i));
            int next = 0;

            // Checks the return value of the next Roman numeral character
            if (i + 1 < roman.length()) {
                next = value(roman.charAt(i + 1));
            }

            // If value of current Roman numeral is smaller than next, the difference is added
            if (curr < next) {
                ans += (next - curr);
                i++; // Skips to the next numeral after "next" numeral
            } else {
                ans += curr; // Adds return value to total answer
            }
        }
        System.out.println(ans);
    }

    public static void RomantoIntAttemptTwo(String roman) {
        int result = 0;
        int i, j;
        char[] romanArray = roman.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50); map.put('C', 100);
        map.put('D', 500); map.put('M', 1000);

        for(i = 0, j = 1; i < romanArray.length; i++, j++) {
            if(map.get(romanArray[i]) >= map.get(romanArray[j])) {
                result += map.get(romanArray[i]);
            } else {result -= map.get(romanArray[i]);}
        }
        result += map.get(romanArray[romanArray.length - 1]);
        System.out.println(result);
    }


    public static void main(String[] args) {
        RomantoIntAttemptOne("MCMXCIV"); // 2 milliseconds with a time complexity of O(n)
        //RomantoIntAttemptOne("IX"); // 5 milliseconds with a time complexity of O(n)
    }
}
