/*  Task Description

Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
*/
 
/*  Example

Input: s = "the sky is blue"
Output: "blue is sky the"
*/


class Solution {
    public static String reverseWords(String s) {
        String[] splitedWords = s.trim().split("\\s+");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = splitedWords.length-1; i >= 0; i--) {
            reversedWords.append(splitedWords[i]);
            if (i > 0) {
                reversedWords.append(" ");
            }
        }

        return reversedWords.toString();
    }
}

/*   Solution Description

1. We initialize an array of Strings called splitedWords by trimming the input string (s) to remove any leading or trailing whitespaces and then splitting 
	it into an array of Strings using the regular expression "\\s+" which matches one or more consecutive whitespaces. 
	This is done to extract the words from the input string.
2. Then we initialize a StringBuilder called reversedWords, which will be used to store the reversed words.
3. The for loop iterates over the array of split words (splitedWords) in reverse order, 
	starting from the last word (splitedWords.length-1) and moving backwards. 
	The variable i is used to keep track of the current index in the array.
4. Line with first append function the current word (i.e., splitedWords[i]) to the StringBuilder called reversedWords, effectively reversing the order of the words in the input string.
5. Conditional statement checks if the current word is not the last word in the reversed sentence. If so, it adds a
6. whitespace to the end of the current word. This ensures that there is only a single whitespace between each pair of words in the reversed sentence.
7. Last line returns the reversed sentence as a String by calling the toString() method on the StringBuilder called reversedWords.