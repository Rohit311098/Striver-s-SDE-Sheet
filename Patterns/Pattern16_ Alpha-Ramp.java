Alpha-Ramp

Example:
Input: ‘N’ = 3

Output: 
A
B B
C C C

public class Solution {
    public static void alphaRamp(int n) {
        char alpa='A';

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(alpa+" ");
            }
            System.out.println();
            alpa++;
        }
    }
}
