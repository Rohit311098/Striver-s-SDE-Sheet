//GFG- Floor in a Sorted Array

class Solution {

    static int findFloor(int[] arr, int k) {
        // write code here
        
        int floor=-1;
        
        int left=0;
        int right=arr.length-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            
            if(arr[mid]<=k)
            {
                floor=mid;
                left=mid+1;
            }
            else 
               right=mid-1;
        }
        return floor;
    }
}


  
