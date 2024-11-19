Reverse Letter Triangle

  Example:
Input: ‘N’ = 3

Output: 

A B C
A B
A

public class Solution {
    public static void nLetterTriangle(int n) {
        
        for(int i=n;i>=1;i--)
        {
            char alpha='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(alpha+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}
