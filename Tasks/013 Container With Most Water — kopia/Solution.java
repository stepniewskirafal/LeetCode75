/*  Task Description

You are given an integer array nums and an integer k.
In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
Return the maximum number of operations you can perform on the array.
*/
 
/*  Example

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.
*/


class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<>();
		//Initialized The Counter
        int count=0;
        for(int i=0; i<nums.length; i++){
		// Checking if the HashMap Contains the k-nums[i] (desired Integer)
            if(hm.containsKey(k-nums[i]) && hm.get(k-nums[i])>0){
                count +=1;
                hm.put((k-nums[i]),(hm.get(k-nums[i])-1));
            }
			// Otherwise we add the Integer to the HashMap
            else{
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }
		// Return the Count
        return count;
	}
}

