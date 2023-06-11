/*  Task Description

Given an integer array nums, return true if there exists a triple of indices (i, j, k) 
such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
*/
 
/*  Example
Input: nums = [1,2,3,4,5]
Output: true
*/


class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min) min = num;
            else if(num < secondMin) secondMin = num;
            else if(num > secondMin) return true;
        }
        return false;
    }
}

/* Explanation

- Line 3-5: Two variables named min and secondMin are initialized to the maximum possible integer value in Java using the Integer class's constant MAX_VALUE.
- Line 6: A for-each loop is used to iterate over the elements of the nums array one by one.
- Line 7-8: If the current number num is less than or equal to the current minimum value min, num is assigned to min.
- Line 9-10: Else if the current number num is less than the current second minimum value secondMin, num is assigned to secondMin.
- Line 11-12: Else if the current number num is greater than the second minimum value secondMin, 
it means we have found a triplet subsequence that satisfies the condition mentioned in the problem statement, so the method returns true.
- Line 13: If the for-loop completes execution without returning true, it means we haven't found any triplet subsequence that satisfies 
the condition mentioned in the problem statement, so the method returns false.