class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int [] ans = new int [queries.length];
        int j = 0;
        
        int sum = 0;  
        for(int ele: nums) sum += ele%2 == 0 ? ele : 0;
        System.out.println(sum);

        
        for(int[] pair: queries) {
            
            int val = pair[0];
            int index = pair[1];
        
            if(nums[index] % 2 == 0) {
                if(val%2 == 0) {
                    sum += val;
                } else {
                    sum -= nums[index];
                }
            } else {
                if(Math.abs(val)%2 == 1) {
                    sum += nums[index] + val;
                }
            }
            nums[index] += val;                      
            ans[j++] = sum;  
        }
        
        return ans;
    }
}