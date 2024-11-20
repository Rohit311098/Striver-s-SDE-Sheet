Alpha Hill

Example:
Input: ‘N’ = 3

Output: 
    A
  A B A
A B C B A



public class Solution {
    public static void alphaHill(int n) {
        

        for(int i=1;i<=n;i++)
        {
            //Spaces
            for(int s=1;s<=2*(n-i);s++)
            {
               System.out.print(" "); 
            }
            char alpa='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(alpa+" ");
                alpa++;
            }
            alpa-=2;
            for(int k=1;k<=i-1 && alpa>='A';k--)
            {
                System.out.print(alpa+" ");
                alpa--;
            }
            System.out.println();
        }
}
}
