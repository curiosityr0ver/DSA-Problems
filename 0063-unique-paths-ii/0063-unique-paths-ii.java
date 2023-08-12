class Solution {
    int [][] dp;
    public int uniquePathsWithObstacles(int[][] grid) {
        
        dp = new int[grid.length+1][grid[0].length+1];
        for(int [] row: dp) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0,0, grid);
        
    }
    
    int dfs(int x, int y, int [][] grid) {
        if(dp[x][y] >= 0) return dp[x][y];
        
        if (x == grid.length || y == grid[0].length || grid[x][y] == 1) dp[x][y] = 0;
        else if(x == grid.length-1 && y == grid[0].length-1) dp[x][y] = 1;
        else dp[x][y]  = dfs(x+1, y, grid) + dfs(x, y+1, grid);
        
        return dp[x][y];
    }
}