Rotated Triangle

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*



public class Solution {
    public static void nStarTriangle(int n) {
        
        // First Half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Second half
        for(int i=1;i<=n-1;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
