AS Sorting 3

Write a program to count the total number of inversions in an array arr[] of size N. Print all of the inversion pairs { (x, y) } as shown below.

Note: Two numbers of array arr at index i and j are said to be inverted pair if arr[i]>arr[j] and i<j.

Input Format

The first line contains integer N denoting the number of elements.

The Second line contains N space seprated integers denoting the elements of the array.

Output Format

Print all the inversion pairs, each in a new line in the format (x,y).

Example 1

Input

4
8 4 2 1

Output

(8, 4)
(8, 2)
(8, 1)
(4, 2)
(4, 1)
(2, 1)

Explanation

8 is greater than 4,2,1 and index is less than their indexes. Similary 4 is greater than 2 and 1 but has smaller index. similar 2 is greater than 1 but has smaller index than 1.

Example 2

Input

3
5 7 2

Output

(5, 2)
(7, 2)

Explanation

both 5 and 7 is greater than 2 and has smaller index. No other pairs satisfy the conditions.

Constraints

0 <= nums.length <= 10^4

-10^9 <= nums[i] <= 10^9
