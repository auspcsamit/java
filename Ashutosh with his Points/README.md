Ashutosh with his Points

Ashutosh has an array 'AR' of 'N' integers. He needs to find the minimum index in the array such that the value at that index is equal to that index. It means 'AR[i]' == 'i', where 'AR[i]' denotes element at the 'i'th index.

The array may contain negative numbers as well.

Your task is to complete the function equalIndex which receives the input array and the integer n as its parameters and returns the first index where the index is equal to the element at that index.

For Example:

If ‘N’ = 5, ‘AR’ = {-1, 1, 3, 5}

In the above example 'AR[1]' == 1, so the answer is 1.

Input Format:

The first line of input contains a single integer ‘N’, denoting the size of the input array.

The next line contains ‘N’ space-separated integers denoting the elements of the array.

Output Format:

You need to print a single integer denoting the index or value at which 'AR[i]' == 1. In case no such value exists, return -1.
Example 1:

Input

4
-1 1 3 5

Output

1

Explanation: 'AR[1]' == 1, so you need to print 1.

Example 2:

Input:

5
-2 -1 0 1 2

Output:

-1

Explanation:

No such value present, so you need to print -1.

Constraints:

1 <= N <= 10^5

-10^9 <= AR[i] <= 10^9
