A Contest

A Contest is held and a total of N participants took part in the contest. You are already given the scores of the participants in the form of an array (of size N).

The contestant who has a score greater than or equal to the score of the K-th Participant (where K<=N) will advance to the next round, as long as the contestant has a positive score.

Calculate the total number of participants who will advance to the next round.

Input

The first line of the input contains two integers N and K separated by a single space.

The second line contains N space-separated integers representing the array.

Output

Print the number of participants who advance to the next round.

Example 1

Input

8 5
10 9 8 7 7 7 5 5

Output

6

Explanation

10, 9, 8, 7, 7, 7 are greater than or equal to 7.

Example 2

Input

4 2
0 0 0 0

Output

0

Explanation

None of the participants has a positive score.

Constraints

1 <= K <= N <= 10^5

-10^6 <= a[i] <= 10^6
