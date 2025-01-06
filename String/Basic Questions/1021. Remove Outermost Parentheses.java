//1021. Remove Outermost Parentheses

class Solution {
    public String removeOuterParentheses(String s) {
        String result="";
        Stack<Character> stk=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                //This check ensure that i will not add outermost opening bracket
                if(stk.size()!=0)
                {
                    result+="(";
                }
                stk.add('(');
            }
            else
            {
                //First we remove the opening bracket 
                stk.pop();
                //If size become enmpty means it was outermost else it means was not outermost
                if(stk.size()!=0)
                {
                    result+=")";
                }
            }
        }
        return result;
    }
}
