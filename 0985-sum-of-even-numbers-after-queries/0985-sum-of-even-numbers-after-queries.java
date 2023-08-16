class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] ans = new int [queries.length];
        int j = 0;
        
        for(int[] pair: queries) {

            nums[pair[1]] +=  pair[0];
            
            int res = 0;
            
            for(int ele: nums) res += ele%2 == 0 ? ele : 0;
            
            ans[j++] = res;  
        }
        
        return ans;
    }
}