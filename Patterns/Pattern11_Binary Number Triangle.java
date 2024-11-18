Binary Number Triangle
Example:
Input: ‘N’ = 3

Output: 
1
0 1
1 0 1

public class Solution {
    public static void nBinaryTriangle(int n) {

        for(int i=1;i<=n;i++)
        {
            int start=i%2==1?1:0;

            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=start==0?1:0;
            }
            System.out.println();
        }
    }
}
