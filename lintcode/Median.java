/*
 * Given a unsorted array with integers, find the median of it. 

A median is the middle number of the array after it is sorted. 

If there are even numbers in the array, return the N/2-th number after sorted.

Example
Given [4, 5, 1, 2, 3], return 3

Given [7, 9, 4, 5], return 5

Challenge
O(n) time.
 */
public class Median {

    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        int i = 1;
        for (; i < nums.length && nums[i - 1] <= nums[i]; ++i);
        if (i == nums.length) {
            return nums[(nums.length - 1) / 2];
        }
              
    }

    public int median(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];
    }

}
