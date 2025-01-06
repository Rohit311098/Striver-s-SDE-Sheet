//1021. Remove Outermost Parentheses

class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        int c=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                //This check ensure that i will not add outermost opening bracket
                if(c!=0)
                {
                    result+="(";
                }
                c++;
            }
            else
            {
                //First we remove the opening bracket 
                c--;
                //If size become enmpty means it was outermost else it means was not outermost
                if(c!=0)
                {
                    result+=")";
                }
            }
        }
        return result;
    }
}
