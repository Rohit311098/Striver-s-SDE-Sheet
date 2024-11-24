Ninja And The Number Patternwqe.

Example:
Input: ‘N’ = 4

Output: 

4444444
4333334
4322234
4321234
4322234
4333334
4444444

public class Solution {
    public static void getNumberPattern(int n) {
        
        int size=2*n-1;
        int start=0;
        int end=size-1;

        //2-D matrix to store the result
        int[][] matrix=new int[size][size];

        while(n>0)
        {
            ///Filling the matrix box by box 
            for(int i=start;i<=end;i++)
            {
                for(int j=start;j<=end;j++)
                {
                    //Just filling the first and last row and column
                    if(i==start || i==end || j==start || j==end)
                    {
                        matrix[i][j]=n;
                    }
                }
            }
            start++;
            end--;
            n--;
        }

        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(matrix[i][j]);
            }
                System.out.println();
        }
    }
}
