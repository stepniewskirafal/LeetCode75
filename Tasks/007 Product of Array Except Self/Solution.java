/*  Task Description

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/
 
/*  Example

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
*/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
		int[] result = new int[n];
		result[0] = 1;
    
		// Calculate the product of all elements to the left of i
		for(int i = 1; i < n; i++) {
			result[i] = result[i-1] * nums[i-1];
		}
    
		int right = 1;
		// Calculate the product of all elements to the right of i and multiply it with the left product
		for(int i = n-1; i >= 0; i--) {
			result[i] *= right;
			right *= nums[i];
		}
    
		return result;
    }
}

