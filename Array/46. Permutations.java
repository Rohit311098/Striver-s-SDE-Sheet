Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
  
Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]

Approach 1: Using Extra Space and Recusion Approach:   TC- O(n! * n)  SC-O(N)+O(N)

class Solution {

  public void permut(int[] nums,List<List<Integer>> ans, List<Integer> sub,boolean[] mark)
  {
    if(nums.length==sub.size())
    {
      ans.add(new ArrayList<>(sub));
      return;
    }
    
    for(int i=0;i<nums.length;i++)
    {
      if(mark[i]!=true)
      {
        mark[i]=true;
        sub.add(nums[i]);
        permut(nums,ans,sub,mark);
        sub.remove(sub.size()-1);
        mark[i]=false;
      }
    }
  }
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      List<Integer> sub=new ArrayList<>();
      boolean[] mark=new boolean[nums.length];
      permut(nums,ans,sub,mark);
      return ans;
    }
}

2. Approach 2: Swap approach-> Swap 1st element with other element and continue.  TC-O(N! * N)   SC-O(N)-> Recursion space and O(N) to copy the array
  
  class Solution {

    public void permut(int[] nums,int index,List<List<Integer>> ans)
    {
      if(index==nums.length)
      {
        // Copy nums to sub
         List<Integer> sub=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
           sub.add(nums[i]);
         }
         ans.add(new ArrayList<>(sub));
         return;
      }

      for(int j=index;j<nums.length;j++)
      {
        swap(j,index,nums);
        permut(nums,index+1,ans);
        swap(j,index,nums);
      }

    }

    public void swap(int i,int j, int[] nums)
    {
      int t=nums[i];
      nums[i]=nums[j];
      nums[j]=t;
    } 
    public List<List<Integer>> permute(int[] nums) {

       List<List<Integer>> ans=new ArrayList<>();
       permut(nums,0,ans);
       return ans; 
    }
}
