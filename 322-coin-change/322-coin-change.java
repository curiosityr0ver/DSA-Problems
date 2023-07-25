class Solution {
    int[][] dp;
    public int coinChange(int[] coins, int amount) {

        // int res = helper1(0, coins, amount);
        dp = new int[coins.length+1][amount+1];
        for(int[] x : dp)
            Arrays.fill(x,-1);
        
        int res = helper2(coins.length, coins, amount);

        
        if(res == 99999) return -1;
        return res;   
    }
    
    
    int helper1(int index, int [] coins, int amt) {
        
        if(dp[index][amt] > 0) return dp[index][amt];
        if(index == coins.length) return amt == 0 ? 0 : Integer.MAX_VALUE;

        
        int res = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;
        while(amt >= sum) {
            if(dp[index][amt-sum] > 0) res = Math.min(res, count + dp[index][amt - sum]);
            else res = Math.min(res, count + helper1(index+1, coins, amt - sum));
            sum += coins[index];
            count++;
        }
        dp[index][amt] = res;
        return res;   
    }
    
    public int helper2(int len, int[] coins, int amt)
    {
        if(amt == 0) return 0;
        if(len == 0) return 99999;
        if(dp[len][amt] != -1) return dp[len][amt];
        int take = 99999;
        
        if(coins[len-1] <= amt)
            take = helper2(len, coins, amt-coins[len-1]);
        int not_take = helper2( len-1 ,coins, amt);
        dp[len][amt] = Math.min(take+1 , not_take);
        return dp[len][amt];
    }
}