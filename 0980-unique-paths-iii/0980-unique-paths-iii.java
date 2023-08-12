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
        
        String[] visArr = vis.split(" ");

        if(grid[x][y] == 2) {
            
            if(visArr.length != count) return 0;
//             for(String v: visArr) {
//                 if(v.length() == 0) continue;
                
//                 String tempX = v.split(",")[0];
//                 String tempY = v.split(",")[1];
//                 System.out.print("(" + tempX + ", " + tempY + "), ");
//             }
//             System.out.println();
            return 1;
        }
        
        
            for(String v: visArr) {
                if(v.length() == 0) continue;
                String [] pair = v.split(",");
                if(x == Integer.parseInt(pair[0]) && y == Integer.parseInt(pair[1])) return 0;

            }    
            vis += x + "," + y + " ";

        return dfs(x, y+1, vis, grid) + dfs(x, y-1, vis, grid) + dfs(x+1, y, vis, grid) + dfs(x-1, y, vis, grid);
    }
}