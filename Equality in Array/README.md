Equality in Array

Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.

Input Format

The first line contains an integer n, the number of elements in arr.

The next line contains n space-separated integers arr[i].

Output Format

A single integer denoting the minimum number of deletions.

Example 1

Input

4
1 2 2 3

Output

2

Explanation

Delete the 2 elements 1 and 3 leaving arr as [2,2]. If both twos plus either the 1 or the 3 are deleted, it takes 3 deletions to leave either [3] or [1]. The minimum number of deletions is 2.
Example 2

Input

5
3 3 2 1 3

Output

2

Explanation

Delete 2 and 1 to leave [3,3,3]. This is minimal. The only other options are to delete 4 elements to get an array of either [1] or [2].

Constraints

0<n<=100

1<=arr[i]<=100
