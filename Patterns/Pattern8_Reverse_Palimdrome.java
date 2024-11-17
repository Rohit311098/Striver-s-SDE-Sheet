Reverse Star
Example:
Input: ‘N’ = 3

Output: 
*****
 ***
  *

public class Solution {
    public static void nStarTriangle(int n) {
        
        for(int i=n;i>=1;i--)
        {
            //Spaces Printing
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
