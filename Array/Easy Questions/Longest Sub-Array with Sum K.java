//Longest Sub-Array with Sum K

Brute Force Approach: Using 2 for loops(This Approach will work for both Positive and negative numbers)
//TC-O(N2)   SC-O(1)

class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        int maxlen=0;
        for(int i=0;i<arr.length;i++)
        {
            int len=0;
            int curr_sum=0;
            for(int j=i;j<arr.length;j++)
            {
                curr_sum+=arr[j];
                len++;
                if(curr_sum==k)
                    maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}



Approach 1: HashMap Approach TC-O(N)   SC-O(N) -> This is the best approach to solve the problem if we have both positive and negative number in the array

  Logic wahi hai sum agar x hai wahi tak k subarray ka toh check karo agar koi x-k exist karta hai toh

  //Vo Zero wala case yaad rakhna zero hoge array mai esliye maine vo check kiya hai ki prefix exist karta hai kya

import java.util.*;
public class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        Map<Long,Integer> map=new HashMap<>();
        long prefix_sum=0;
        int max_len=0;
        for(int i=0;i<a.length;i++)
        {
            prefix_sum+=a[i];
            if(prefix_sum==k)
            {
                max_len=Math.max(max_len,i+1);
            }
            if(map.containsKey(prefix_sum-k))
            {
                int len=i-map.get(prefix_sum-k);
                max_len=Math.max(max_len,len);
            }

            //This condition we added because agar zero hoge array mai toh vo update karta rahega
            //index ko which we don't want want 
            if(!map.containsKey(prefix_sum))
                map.put(prefix_sum,i);
        }
        return max_len;
    }
}



Approach 2: This approach only works when we only have positive numbers in the array























