class Solution {
    int [] coinsArr;
    int[][] dp = new int[1000][10000];
    int res = 0;
    
    public int change(int amount, int[] coins) {
        coinsArr = coins;
        
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
            int res = 0;
            while(amt >= sum) {
                res += dfs(index+1, amt-sum);
                sum += coinsArr[index];
            }
            dp[index][amt] = res; 
        }
        
        return dp[index][amt];
    }
}