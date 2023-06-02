/*  Task Description

For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
*/
 
/*  Example

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
*/


public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}


/*   Solution Description
1 A method named "gcdOfStrings" is being defined within the "Solution" class, which takes in two parameters, both of type String. 
	The method is designed to calculate the greatest common divisor of two input strings 'str1' and 'str2'.
2 Within the method, an if statement is being used to compare equality between the concatenation of the two input strings 'str1' and 'str2', 
	and 'str2' concatenated with 'str1'. 
	This is done to check if the input strings share a common prefix or suffix.
3 If the previous comparison is false, an empty String is being returned, because a common divisor does not exist if there is no common prefix or suffix.
4 An integer variable 'gcd' is created with the result of a call to a private method called 'gcd', passing in the length of 'str1' and 'str2'. 
	This is done to calculate the greatest common divisor of the lengths of 'str1' and 'str2', 
	which can be used to find the common prefix or suffix later on.
5 The method returns a substring of 'str1' starting from index 0 and ending at the value of gcd. 
	This is done to extract the common prefix or suffix from the input string 'str1', 
	which will have a length equal to the greatest common divisor computed earlier.
6 A private helper method called 'gcd' is defined, which calculates the greatest common divisor between two integer values 'a' and 'b' using a recursive approach. 
	This is done to avoid code duplication when calculating the greatest common divisor of the lengths of two input strings, 
	which is required in the 'gcdOfStrings' method implementation.
*/