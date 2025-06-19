/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.*/

public class LongestCommonPrefix {

    public static String AttemptOnelongestCommonPrefix(String[] strings) {
        if(strings == null || strings.length == 0) return "";
        if(strings.length == 1) return strings[0];

        int index_of_chars = 0;

        while(true){
            if(strings[0].length() <= index_of_chars){
                break;
            }

            char temp_char = strings[0].charAt(index_of_chars);
            for(int i = 1; i < strings.length; i++){
                if(strings[i].length() <= index_of_chars ||
                        strings[i].charAt(index_of_chars) != temp_char){
                    return strings[0].substring(0, index_of_chars);
                }
            }
            index_of_chars++;
        }
        return strings[0].substring(0, index_of_chars);
    }

        public static void main (String[] args){
            String[] string = {"a", "ab"};

            /* 1 millisecond with a time complexity of O(L∗N),
             where L is the length of the shortest string and N is the number of strings*/
            System.out.println(AttemptOnelongestCommonPrefix(string));



        }
    }
