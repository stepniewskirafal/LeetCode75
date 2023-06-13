/*  Task Description

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
*/
 
/*  Example
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/


	class Solution {
		public void moveZeroes(int[] nums) {
			int i = 0; 
			for (int num:nums){
				if(num != 0){
					nums[i] = num;
					i++;
				}
			}
			while(i<nums.length){
				nums[i] = 0;
				i++;
			}
		}
	}
	
/*  Explanation
The code step by step:

Initialize a variable i to 0. This variable will be used to keep track of the index where the next non-zero element should be placed.
Start a loop that iterates over each element num in the nums array.
Check if the current element num is not equal to 0 (which means it's a non-zero element).
If the current element is non-zero, assign it to the position nums[i] in the array, and then increment i by 1. This moves the non-zero element to the left side of the array.
After processing all the elements in the array, there might be some remaining positions towards the end of the array that need to be filled with zeros.
Start another loop that continues from the last value of i until the end of the array (nums.length).
Set the value of nums[i] to 0, effectively placing zeros in the remaining positions at the end of the array.
Increment i by 1 in each iteration to move to the next position in the array.
Once this loop is completed, all the non-zero elements have been moved to the front of the array, and any remaining positions towards the end of the array have been filled with zeros.
The code rearranges the array in-place, meaning it modifies the original nums array without creating a new one. After calling this moveZeroes method, the array nums will have all the zeros moved to the end while preserving the order of the non-zero elements.