class Solution {
        boolean[][] visited=new boolean[999][999];

    public int numIslands(char[][] grid) {
    int count=0;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && !visited[i][j]){
                explore(grid,i,j);
                count++;
            }
        }
    }
    return count;
}
    public void explore(char[][] grid, int i, int j){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length  || visited[i][j]==true || grid[i][j]=='0'){
            return;
        }
        
        visited[i][j]=true;

        explore(grid,i-1,j);
        explore(grid,i,j+1);
        explore(grid,i,j-1);
        explore(grid,i+1,j);
    }
}