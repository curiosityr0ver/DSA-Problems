class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            count += helper(i, nums, k); 
        }
        
        return count;
    }
    
    int helper(int ind, int [] arr, int tgt) {
        int sum = 0;
        int res = 0;
        
        for(int i = ind; i < arr.length; i++) {
            sum += arr[i];
            if(sum == tgt) res++;
        }
        
        return res;
    }
}