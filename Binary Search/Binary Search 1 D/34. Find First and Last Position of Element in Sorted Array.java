//34. Find First and Last Position of Element in Sorted Array

class Solution {
     public int getfirst(int[] arr,int x)
    {
        int first=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==x) 
            {
                first=mid;
                right=mid-1;
            }
            else if(arr[mid]<x) left=mid+1;
            else right=mid-1;
        }
        return first;
    }
    
    public int getlast(int[] arr,int x)
    {
        int last=-1;
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==x) 
            {
                last=mid;
                left=mid+1;
            }
            else if(arr[mid]>x) right=mid-1;
            else left=mid+1;
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=getfirst(nums,target);
        result[1]=getlast(nums,target);
        return result;
    }
}
