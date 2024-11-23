Symmetry Pattern

Example:
Input: ‘N’ = 3

Output: 
*         *
* *     * *
* * * * * *
* *     * *
*         *


public class Solution {
    public static void symmetry(int n) {
        
      // For first n rows
        for(int i=1;i<=n;i++)
        {
            //Stars-> Printing
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            //Spaces Printing
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //Stars Printing
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        //For next n-1 rows
        for(int i=n-1;i>=1;i--)
        {
            //Stars-> Printing
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            //Spaces Printing
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //Stars Printing
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
             System.out.println();
        }

    }
}
