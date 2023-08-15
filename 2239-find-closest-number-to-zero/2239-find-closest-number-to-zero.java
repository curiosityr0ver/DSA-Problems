class Solution {
    public int findClosestNumber(int[] nums) {
        
        int res = 999999;
        
        for(int ele: nums) {
            
            if((ele > 0 ? ele : -ele) < (res > 0 ? res : -res)) res = ele;
            else if((ele > 0 ? ele : -ele) == (res > 0 ? res : -res)) res = res > 0 ? res : ele;
        }
        
        return res;
    }
}