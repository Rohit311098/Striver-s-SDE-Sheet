LC 73. Set Matrix Zeroes

If values are greater than 0 then this approach can work

TC- O((N*M) * (N+M))

class Solution {
    
    public void makeallelezero(int[][] matrix,int i,int j)
    {
        //Making row element to -1 which are greater than 0
        for(int a=0;a<matrix.length;a++)
        {
            if(matrix[a][i]>0)
            {
                matrix[a][i]=-1;
            }
        }
        
        //Making column element to -1  which are greater than 0
        for(int a=0;a<matrix.length;a++)
        {
            if(matrix[j][a]>0)
            {
                matrix[j][a]=-1;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==1 || matrix[i][j]==-1)
                {
                    continue;
                }
                
                makeallelezero(matrix,i,j);
            }
        }
    }
}
