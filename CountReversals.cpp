/*

Link : https://practice.geeksforgeeks.org/problems/count-the-reversals0401/1#
Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to convert the string into a balanced expression.
A reversal means changing '{' to '}' or vice-versa.

Example 1:

Input:
S = "}{{}}{{{"
Output: 3
Explanation: One way to balance is:
"{{{}}{}}". There is no balanced sequence
that can be formed in lesser reversals.*/

int countRev (string s)
{
    // your code here
    if(s.length() & 1 )  // if length of string is odd return -1
        return -1;
    stack<char> st;
    int closingCount = 0,openingCount = 0;
    
    for(int i=0;i<s.length();i++)
    {
        if(s[i] == '{')
        {
            st.push(s[i]);
            openingCount++;
        }
        else if(s[i] == '}' and !st.empty() and st.top() == '{')
        {
            st.pop();               //balanced , so removing that braces
            openingCount--;
        }
        else
            closingCount++;
    }
    // after this iteration we will get all unbalanced brackets
    
    // }}} {{{{{   here for closing brackets we need to change 2 brackets and  
    // in opening brackets 3 must be changed , it means ceil(count/2) 
    // if seperate count is odd
    // else count/2
    
    if(openingCount & 1)
        openingCount = (openingCount/2)+1;
    else
        openingCount = openingCount/2;
        
    if(closingCount & 1)
        closingCount = (closingCount/2)+1;
    else
        closingCount = closingCount/2;
    
    return openingCount+closingCount;
        
        
    
    
    
    
    
}
