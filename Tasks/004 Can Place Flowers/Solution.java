/*  Task Description

You have a long flowerbed in which some of the plots are planted, and some are not. 
However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, 
and an integer n, return true if n new flowers can be planted in the flowerbed without 
violating the no-adjacent-flowers rule and false otherwise.
*/
 
/*  Example

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
*/


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}


/*   Solution Description
The first line checks if the value of n is equal to zero. 
If it is, then the method returns true since it is always possible to plant zero flowers in any flowerbed.

The method then iterates through all the plots in the flowerbed using a for loop. 
For each plot, the code checks if it is empty (represented by a 0 in the flowerbed array) 
and if its adjacent plots are also empty. 
This is achieved with the following condition `(i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)`.

If the condition is true, then a new flower can be planted in the current plot, so the code changes its value to 1 and decrements the value of `n` by 1. 
The method continues to repeat this process until either all n flowers have been planted or all plots in the flowerbed have been checked.

If the value of `n` becomes zero, then the method returns true since all flowers were successfully planted. 
Otherwise, the method returns false since it was not possible to plant `n` new flowers in the given flowerbed.
*/