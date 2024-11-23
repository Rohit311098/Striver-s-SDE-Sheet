Symmetric Void

  Example:
Input: ‘N’ = 3

Output: 
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * *

  public class Solution {
    public static void symmetry(int n) {

        //For First N rows
        for(int i=n;i>=1;i--)
        {
            //Stars->1
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            //Spaces
            for(int s=1;s<=2*(n-i);s++)
            {
                System.out.print(" ");
            }

            //Stars->2
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        //For next n rows
        for(int i=1;i<=n;i++)
        {
            //Stars->1
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            //Spaces
            for(int s=1;s<=2*(n-i);s++)
            {
                System.out.print(" ");
            }

            //Stars->2
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
