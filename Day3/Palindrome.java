/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise. */

class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        int st = 0;
        int lt = s.length() - 1;
        while(st <= lt) {
        	char cf = s.charAt(st);
        	char cl = s.charAt(lt);
        	if (!Character.isLetterOrDigit(cf )) st++;
        	else if(!Character.isLetterOrDigit(cl)) lt--;
            else {
        		if (Character.toLowerCase(cf) != Character.toLowerCase(cl)) return false;
        		st++;
        		lt--;
        	}
        }
        return true;
    }
}