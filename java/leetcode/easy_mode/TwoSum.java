/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1] */

import java.util.Arrays;

public class TwoSum {

    static void attemptOneTwoSum(int[] listofNums, int target){
        int[] output = new int[2];

        for(int i = 0; i < listofNums.length; i++){
            for(int j = i+1; j < listofNums.length; j++){
                if(listofNums[i] + listofNums[j] == target){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        System.out.println("Solution: " + Arrays.toString(output));
    }

    public static void main(String[] args){
         int[] nums = {2,7,11,15};
         int target = 9;

         attemptOneTwoSum(nums,target); // 49 milliseconds with a complexity of O(n^2)
    }
}
