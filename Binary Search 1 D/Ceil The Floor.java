// GFG- Ceil The Floor

class Solution {
    
    public int getfloor(int[] arr,int x)
    {
        int floor=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<=x) 
            {
                floor=arr[mid];
                left=mid+1;
            }
            else right=mid-1;
        }
        return floor;
    }
    
    public int getceil(int[] arr,int x)
    {
        
        int ceil=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=x) 
            {
                ceil=arr[mid];
                right=mid-1;
            }
            else left=mid+1;
        }
        return ceil;
        
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        
        Arrays.sort(arr);
        int[] result=new int[2];
        result[0]=getfloor(arr,x);
        result[1]=getceil(arr,x);
        return result;
    }
}
