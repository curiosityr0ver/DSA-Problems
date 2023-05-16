class Solution {
    int [][] dp = new int[1000][1000];
    boolean [][] visited = new boolean[1000][1000];

    public int minimumTotal(List<List<Integer>> triangle) {
        return help(0, 0, triangle);
    }
    
    int help( int row, int col, List<List<Integer>> arr) {
        if(visited[row][col]) return dp[row][col];
        
        dp[row][col] = arr.get(row).get(col);
        visited[row][col] = true;

        if(row < arr.size()-1) {
            dp[row][col] += Math.min(
            help(row+1, col+1, arr),
            help(row+1, col, arr)
        );
    }
        return dp[row][col];
    }
}