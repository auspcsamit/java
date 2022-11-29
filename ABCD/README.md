ABCD

Ramesh has developed an algorithm ABCD where, given a N x N Matrix, we have to print

Col1sum - Row1sum

Col2sum - Row2sum

Col3sum - Row3sum

Col4sum - Row4sum

....

Colnsum - Rownsum

Input Format:

Input consists of a single integer N followed by N lines each containing Nelements

Output Format:

Print N lines corresponding to the col-row difference. Return an array with the required answer.

EXAMPLE 1:

Input:

5
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5

Output::

0
-20
10
-10
20

EXPLANATION:

We have N = 5.

Calculate the sum corresponding to the rows and columns

EXAMPLE 2:

Input:

2
1 2
3 4

Output::

1
-1

EXPLANATION:

We have N = 2.

Calculate the sum corresponding to the rows and columns

CONSTRAINTS:

1 <= N <= 1000
