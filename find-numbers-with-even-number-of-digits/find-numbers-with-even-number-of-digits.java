class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        
        for(int ele: nums) {
            res += String.valueOf(ele).length()%2==0?1:0;
        }
        return res;
    }
    
}