// 1903. Largest Odd Number in String

Brute Force Approach: Find all the string from back side convert to integer and then check if it is odd or even

  class Solution {
    public static String largestOddNumber(String nums) {
	        
	        for(int i=0;i<nums.length();i++)
	        {
	        	String substr=nums.substring(0, nums.length()-i);
	            if(isOdd(substr)) return substr;
	        }
	        return "";
	    }

	    public static boolean isOdd(String str)
	    {
	        int num=Integer.valueOf(str);
	        return num%2==0?false:true;
	    }
}


Optimised Approach: Just check the last value it gives us whether the number is odd or even

  class Solution {
    public static String largestOddNumber(String nums) {
	        
	        for(int i=nums.length()-1;i>=0;i--)
	        {
                int n=nums.charAt(i)-'0';
                if(n%2!=0)
                {
                    return nums.substring(0,i+1);
                }
	        }
	        return "";
	    }
}
