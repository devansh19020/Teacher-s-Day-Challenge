/* Given an integer array nums, find the subarray with the largest sum, and return its sum. */

class Solution {
    public int maxSubArray(int[] nums) {
        int csum = 0;
        int res = Integer.MIN_VALUE;
        for(int i : nums){
            csum += i;
            res = Math.max(res, csum);
            if(csum<0) csum = 0;
        }
        return res;
    }
}