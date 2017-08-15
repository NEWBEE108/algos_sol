/*
Given an unsorted array of integers, find the length of the longest consecutive
elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int result = 1;
        int count = 1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (nums[i] != nums[i - 1]) {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }

}
