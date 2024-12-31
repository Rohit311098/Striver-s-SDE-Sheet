//33. Search in Rotated Sorted Array

class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) return mid;

            //find which part is sorted means from left to mid  or mid toright

            //If left part is sorted
            if(nums[mid]>=nums[left])
            {
                if(target>=nums[left] && target<nums[mid])
                {
                    right=mid-1;

                }
                else
                {
                    left=mid+1;
                }

            }
            //Right side is sorted
            else
            {
                if(target>nums[mid] && target<=nums[right])
                {
                    left=mid+1;

                }
                else
                {
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
