Increasing Letter Triangle
Example:
Input: ‘N’ = 3

Output: 

A
A B
A B C

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

        for(int i=1;i<=n;i++)
        {
            char alp='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(alp+" ");
                alp++;
            }
            System.out.println();
        }
    }
}

