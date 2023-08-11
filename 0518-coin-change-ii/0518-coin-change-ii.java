class Solution {
    int [] coinsArr;
    int[][] dp;
    int res = 0;
    
    public int change(int amount, int[] coins) {
        coinsArr = coins;
        dp = new int[coins.length+1][amount+1];
        
        for(int [] row: dp) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0, amount);
    }
    
    int dfs(int index, int amt) {
        if(dp[index][amt] > -1) return dp[index][amt];
        
        
        if(index == coinsArr.length) {
            dp[index][amt] = (amt == 0) ? 1 : 0;
            
        } else {
            int sum = 0;
            while(amt >= sum) {
                dp[index][amt] += dfs(index+1, amt-sum);
                sum += coinsArr[index];
            }
            dp[index][amt]++; 
        }
        
        return dp[index][amt];
    }
}