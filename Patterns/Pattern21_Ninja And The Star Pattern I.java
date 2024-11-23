Ninja And The Star Pattern I
Example:
Input: ‘N’ = 4

Output: 

****
*  *
*  *
****

public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here

        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                //Spaces Printing
                for(int j=1;j<=n-2;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
