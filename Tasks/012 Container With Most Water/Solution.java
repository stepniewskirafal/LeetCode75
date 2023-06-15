/*  Task Description

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by 
deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/
 
/*  Example
Input: s = "abc", t = "ahbgdc"
Output: true
*/


	class Solution {
		public boolean isSubsequence(String s, String t) {
			char[] sTab = s.toCharArray();
			char[] tTab = t.toCharArray();
			int count = 0;

			int sPointer=0,tPointer=0;
			while(sPointer <sTab.length && tPointer <tTab.length){
				if(sTab[sPointer] == tTab[tPointer] ){
					count++;
					sPointer++;
					tPointer++;
				}else{
					tPointer++;
				}
			}

			return count==sTab.length ? true : false;
		}
	}
	
/*  Explanation

This solution aims to determine whether string s is a subsequence of string t. 
It follows a simple approach of iterating through both strings simultaneously and comparing the characters at corresponding positions.
The algorithm initializes two pointers, sPointer and tPointer, to track the current positions in s and t respectively. 
It also initializes a variable count to keep track of the number of matching characters found.
The while loop continues as long as both pointers are within the bounds of their respective strings. 
Within the loop, the algorithm checks if the characters at the current positions (sPointer and tPointer) are equal. 
If they are, it increments the count and advances both pointers to the next positions. This indicates a successful match between the characters of s and t.
If the characters are not equal, it means there is no match at the current position in t, 
so the algorithm advances the tPointer to the next position to continue the search.
After the loop terminates, the algorithm checks if the count is equal to the length of sTab. 
If it is, it means that all characters of s were successfully matched in the correct order within t, and thus s is a subsequence of t. 
In this case, the algorithm returns true. Otherwise, it returns false.
This solution has a time complexity of O(n), where n is the length of the longer string between s and t, as it iterates through the strings once.