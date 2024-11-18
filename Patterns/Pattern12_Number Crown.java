Number Crown
Example:
Input: ‘N’ = 3
Output: 

1         1
1 2     2 1
1 2 3 3 2 1

public class Solution {
    public static void numberCrown(int n) {
        for(int i=1;i<=n;i++)
        {
            //First Half
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            //Spaces
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            //Second Half Printing
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
