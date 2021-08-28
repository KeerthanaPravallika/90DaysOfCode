/*

Question Link - https://leetcode.com/problems/longest-valid-parentheses/
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 

Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
*/

class Solution {
    public int longestValidParentheses(String s) 
    {
        Stack<Character> ct = new Stack();
        Stack<Integer> index = new Stack();
        
        index.add(-1);
        
        int max=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                ct.add('(');
                index.add(i);
            }
            else
            {
                if(!ct.empty() && ct.peek() == '(')
                {
                    ct.pop();
                    index.pop();
                    max = Math.max(max,i-index.peek());
                }
                else
                    index.add(i);
                
            }
        }
        return max;
    }
}
