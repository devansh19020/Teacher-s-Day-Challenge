/*Given an array nums of integers, return how many of them contain an even number of digits. */

class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i : nums){
            int n = 0;
            while(i>0){
                i /= 10;
                n++;
            }
            if((n&1)==0) res++;
        }
        return res;
    }
}