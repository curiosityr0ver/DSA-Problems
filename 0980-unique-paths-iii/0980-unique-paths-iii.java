class Solution {
    int [][] dp = new int[100][100];
    
    
    
    int count = 1;
    public int uniquePathsIII(int[][] grid) {
        int x = 0, y = 0;
        
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                dp[i][j] = -1;
            }
        } 
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0) count++;
                else if(grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }
        
        return dfs(x, y, "", grid);
    }
    
    int dfs(int x, int y, String vis, int [][] grid) {

        if(x == grid.length || y == grid[0].length || x < 0 || y < 0 || grid[x][y] == -1) {
            return 0;
        }
        
        if(dp[x][y] >= 0) return dp[x][y];


        if(grid[x][y] == 2) {
            // for(String v: vis.split(" ")) System.out.print("(" + v + "),");
            // System.out.println();
            return vis.split(" ").length == count ? 1 : 0;
            // return dp[x][y];
        }
        
            if(vis.length() > 0) for(String v: vis.split(" ")) if(v.equals(x + "," + y))  {
                // dp[x][y] = 0;
                return 0;
            }

            vis += x + "," + y + " ";

        return dfs(x, y+1, vis, grid) + dfs(x, y-1, vis, grid) + dfs(x+1, y, vis, grid) + dfs(x-1, y, vis, grid);
        // return dp[x][y];
    }
}