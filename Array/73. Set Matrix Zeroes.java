LC 73. Set Matrix Zeroes

Approach 1- If values are greater than 0 then this approach can work

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


Approach 2- Using Two dummy array 

TC- O(2(N*M))
 SC- O(N) + O(M)
    
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int r=matrix.length;
        int c=matrix[0].length;
        
        int[] row=new int[r];
        int[] column=new int[c];
        
        Arrays.fill(row,1);
        Arrays.fill(column,1);
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]!=0)
                {
                    continue;
                }
                
                row[i]=0;
                column[j]=0;
            }
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(row[i]==0 || column[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
