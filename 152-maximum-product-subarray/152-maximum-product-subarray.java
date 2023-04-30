class Solution {
     public int maxProduct(int[] nums) {
        
        int max = nums[0], min = nums[0], ans = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            
            int temp = max;  // store the max because before updating min your max will already be updated
            
            max = big(big(max * nums[i], min * nums[i]), nums[i]);
            min = small(small(temp * nums[i], min * nums[i]), nums[i]);
            
            if (max > ans) {
                ans = max;
            }
        }
        
        return ans;

    }
    int big(int a, int b) {
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }
    int small(int a, int b) {
        if(a<b) {
            return a;
        } else {
            return b;
        }
    }
}