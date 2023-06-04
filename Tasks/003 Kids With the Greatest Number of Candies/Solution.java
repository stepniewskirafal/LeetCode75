/*  Task Description

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
*/
 
/*  Example

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]
*/


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final int max = Arrays.stream(candies)
                                .max()
                                .getAsInt();
	    return Arrays.stream(candies)
                        .mapToObj(candy -> (candy + extraCandies >= max))
                        .collect(Collectors.toList());
    }
}


/*   Solution Description
1. public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { - defining a public method 'kidsWithCandies' 
	which takes two parameters - an array of integers named 'candies', and an integer named 'extraCandies'. 
	The method returns a List of Boolean values.
2. final int max = Arrays.stream(candies) - creating a new integer variable named 'max' which is assigned the maximum value from the 'candies' array using Java streams.
3. max() - applying the 'max' method on the array stream to get the maximum value in the array.
4. getAsInt(); - calling the 'getAsInt' method to convert the maximum value to an integer and storing the result in the 'max' variable.
5. return Arrays.stream(candies) - returning a new stream of integers from the 'candies' array.
6. mapToObj(candy -> (candy + extraCandies >= max)) - mapping each integer in the stream to a Boolean value using a lambda expression. 
	The Boolean value is true if the integer plus 'extraCandies' is greater than or equal to 'max', and false otherwise.
7. .collect(Collectors.toList()); - collecting the mapped Boolean values into a list and returning that list as the result of the method.
*/