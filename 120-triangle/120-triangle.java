class Solution {
    int [][] dp = new int[1000][1000];
    boolean [][] visited = new boolean[1000][1000];
    private Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new Integer[n][n];
        return help(0, 0, triangle);
    }

//     private int help(int row, int col, List<List<Integer>> arr) {
//         if (memo[row][col] != null) return memo[row][col];

//         memo[row][col] = arr.get(row).get(col);
//         if (row < arr.size() - 1) 
//             memo[row][col] += Math.min(help(row + 1, col, arr), help(row + 1, col + 1, arr));

//         return memo[row][col];
//     }
    
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