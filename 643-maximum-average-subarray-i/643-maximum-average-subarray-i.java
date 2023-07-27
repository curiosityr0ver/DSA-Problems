class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double res = 0;
        int i = 0;
        while (i < k) {
            avg += nums[i++];
        }
        res = avg;
        for(; i < nums.length; i++) {
            avg = avg - nums[i-k] + nums[i];
            res = Math.max(res, avg);
        }
        return res/k;
    }
}