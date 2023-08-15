class Solution {
    public int findClosestNumber(int[] nums) {
        
        int res = 999999;
        
        for(int ele: nums) {
            if(Math.abs(ele) < Math.abs(res)) res = ele;
            else if((ele > 0 ? ele : -ele) == Math.abs(res)) res = res > 0 ? res : ele;
        }
        
        return res;
    }
}