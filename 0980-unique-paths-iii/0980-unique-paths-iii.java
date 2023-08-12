class Solution {
    int count = 1;
    public int uniquePathsIII(int[][] grid) {
        int x = 0, y = 0;
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
        if(x == grid.length || y == grid[0].length || x < 0 || y < 0 || grid[x][y] == -1) return 0;

        if(grid[x][y] == 2) {
            
            return vis.split(" ").length == count ? 1 : 0;
//             for(String v: visArr) System.out.print("(" + v.split(",")[0] + ", " + v.split(",")[1] + "), ");
//             System.out.println();
        }
        
        
            for(String v: vis.split(" ")) {
                if(v.length() == 0) continue;
                // String [] pair = v.split(",");
                if(v.equals(x + "," + y)) return 0;
                // if(x == Integer.parseInt(pair[0]) && y == Integer.parseInt(pair[1])) return 0;

            }    
            vis += x + "," + y + " ";

        return dfs(x, y+1, vis, grid) + dfs(x, y-1, vis, grid) + dfs(x+1, y, vis, grid) + dfs(x-1, y, vis, grid);
    }
}