public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {  // 1 millisecond with a time complexity of O(n)
        int replace = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[replace++] = nums[i];
            }
        }
        return replace;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        int[] expectedNums = {};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
        System.out.println(k);
    }
}
