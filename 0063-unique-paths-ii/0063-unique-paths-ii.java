class Solution {
    int [][] dp = new int [100][100];
    public int uniquePathsWithObstacles(int[][] grid) {
        
        for(int [] row: dp) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0,0, grid);
        
    }
    
    int dfs(int x, int y, int [][] grid) {
        if (x == grid.length || y == grid[0].length || grid[x][y] == 1) return 0;
        else if(x == grid.length-1 && y == grid[0].length-1) return 1;
        
        if(dp[x][y] >= 0) return dp[x][y];
        
        dp[x][y]  = dfs(x+1, y, grid) + dfs(x, y+1, grid); 
        return dp[x][y];
    }
}