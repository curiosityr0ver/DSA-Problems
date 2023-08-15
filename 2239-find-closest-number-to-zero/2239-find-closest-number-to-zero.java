class Solution {
    public int findClosestNumber(int[] nums) {
        
        int res = 999999;
        
        for(int ele: nums) {
            if(Math.abs(ele) < Math.abs(res)) {
                res = ele;
            } else if(Math.abs(ele) == Math.abs(res)) {
                res = Math.max(res, ele);
            }
        }
        
        return res;
    }
}