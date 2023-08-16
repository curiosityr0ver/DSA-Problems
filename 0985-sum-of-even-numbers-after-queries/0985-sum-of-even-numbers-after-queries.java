class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] ans = new int [queries.length];
        int j = 0;
        
        for(int[] pair: queries) {
            int val = pair[0];
            int index = pair[1];
            
            nums[index] += val;
            
            int res = 0;
            
            for(int ele: nums) res += ele%2 == 0 ? ele : 0;
            
            ans[j++] = res;  
        }
        
        return ans;
    }
}