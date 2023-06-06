/*  Task Description

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
*/
 
/*  Example

Input: s = "hello"
Output: "holle"
*/


public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] stringArray = s.toCharArray();
        int left = 0, right = stringArray.length - 1;
        while (left < right) {
            if (!vowels.contains(stringArray[left])) {
                left++;
            } else if (!vowels.contains(stringArray[right])) {
                right--;
            } else {
                char tmp = stringArray[left];
                stringArray[left] = stringArray[right];
                stringArray[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(stringArray);
    }
} 

/*   Solution Description
1. Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
This line initializes a Set object "vowels" which contains all the vowels (lowercase and uppercase) as Characters.

2. char[] stringArray = s.toCharArray();
This line converts the input string into a character array "stringArray".

3. int left = 0, right = stringArray.length - 1;
This line declares and initializes two integer variables "left" and "right" to keep track of the position of the vowels in the string. 
"left" starts from the first character of the string and "right" starts from the last character.

4. while (left < right) {
This line declares a while loop that runs until the "left" and "right" pointers cross each other.

5. if (!vowels.contains(stringArray[left])) {
This line checks if the character at "left" index is a vowel. If it is not a vowel, it increments the "left" pointer to check the next character.

6. } else if (!vowels.contains(stringArray[right])) {
This line checks if the character at "right" index is a vowel. If it is not a vowel, it decrements the "right" pointer to check the previous character.

7. } else {
This is the else block that runs if both the character at "left" and "right" indices are vowels.

8.  char tmp = stringArray[left];
	stringArray[left] = stringArray[right];
	stringArray[right] = tmp;
These lines swap values pointed by left and right pointers.

9. left++;
This line increments the "left" pointer to check the next character.

10. right--;
This line decrements the "right" pointer to check the previous character.

11. return new String(stringArray);
This line converts the character array "stringArray" back into a string and returns the reversed vowel string.
