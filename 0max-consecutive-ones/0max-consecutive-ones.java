class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tempRes = 0;
        
        for(int ele: nums) {
            if(ele == 1) {
                tempRes++;
                res = Math.max(res, tempRes);
            } else {
                tempRes = 0;
            }
        }
        return res;
        
    }
}