class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, avg = 0;
        while (i < k) avg += nums[i++];
        
        int res = avg;
        while(i < nums.length) {
            avg = avg - nums[i-k] + nums[i++];
            res = Math.max(res, avg);
        }
        return (double)res/k;
    }
}