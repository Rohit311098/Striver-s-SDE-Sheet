Pyramid
Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****


public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=1;i<=n;i++)
        {
            //Spaces
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            //Print Stars
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
