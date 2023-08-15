class Solution {
    public int findClosestNumber(int[] nums) {
        
        int res = 999999;
        
        for(int ele: nums) {
            if(Math.abs(ele) < Math.abs(res)) res = ele;
            else if(Math.abs(ele) == Math.abs(res)) res = res > 0 ? res : ele;
        }
        
        return res;
    }
}