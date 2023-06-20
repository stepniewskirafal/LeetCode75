/*  Task Description

You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 
Any answer with a calculation error less than 10-5 will be accepted.
*/
 
/*  Example

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
*/


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        double currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (i >= k - 1) { // if we have a window of size k
                double currentAverage = currentSum / k;
                maxAverage = Math.max(maxAverage, currentAverage);
                currentSum -= nums[i - k + 1]; // remove the leftmost element from the window
            }
        }
        return maxAverage;
    }
}

