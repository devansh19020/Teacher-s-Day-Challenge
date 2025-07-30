/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type. */

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') 
                st.push(ch);
            else if(!st.isEmpty() && (ch == ')' && st.peek() == '(' ||
                    ch == '}' && st.peek() == '{' ||
                    ch == ']' && st.peek() == '[')) st.pop();
            else return false;
        }
        return st.isEmpty();
    }
}