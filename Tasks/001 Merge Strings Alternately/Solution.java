/*  Task Description
You are given two strings word1 and word2. 
Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/
 
/*  Example

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*/


class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        final int lengthWord1 = word1.length();
        final int lengthWord2 = word2.length();
        int i = 0;
        int j = 0;
        while (i < lengthWord1 || j < lengthWord2) {
            if (i < lengthWord1) {
                sb.append(word1.charAt(i++));
            }
            if (j < lengthWord2) {
                sb.append(word2.charAt(j++));
            }
        }
        return sb.toString();
    }
}


/*   Solution Description
1. public String mergeStrings(String word1, String word2) {` - defining a method 'mergeStrings' which takes in two parameters, both of type String.
2. StringBuilder sb = new StringBuilder();` - creating a new StringBuilder object 'sb' which is used to append the merged strings.
3. int i=0, j=0;` - initializing two pointers 'i' and 'j' which will point to the current character of each string.
4. while(i<word1.length() || j<word2.length()) {` - iterating through both the strings as long as either of them are not fully traversed.
5. if(i<word1.length())` - checking if there are still characters left in 'word1'.
6. sb.append(word1.charAt(i++));` - appending the character at the current pointer 'i' from 'word1' to the StringBuilder object 'sb', and incrementing the pointer afterwards using the post-increment operator.
8. if(j<word2.length())` - checking if there are still characters left in 'word2'.
9. sb.append(word2.charAt(j++));` - appending the character at the current pointer 'j' from 'word2' to the StringBuilder object 'sb', and incrementing the pointer afterwards using the post-increment operator.
10. return sb.toString();` - returning the merged strings as a String object.
*/