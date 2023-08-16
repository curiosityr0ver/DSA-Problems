class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] ans = new int [queries.length];
        int j = 0, sum = 0;  
        for(int ele: nums) sum += ele%2 == 0 ? ele : 0;

        
        for(int[] pair: queries) {

                sum += nums[pair[1]] % 2 == 0 ? pair[0]%2 == 0 ? pair[0] : -nums[pair[1]] : pair[0]%2 != 0 ?  nums[pair[1]] + pair[0] : 0;

                
            nums[pair[1]] += pair[0];                      
            ans[j++] = sum;  
        }
        return ans;
    }
}