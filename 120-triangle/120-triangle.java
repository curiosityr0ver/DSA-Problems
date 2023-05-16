class Solution {
    int [][] dp;
    private Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new Integer[n][n];
        return help(0, 0, triangle);
    }

    private int help(int row, int col, List<List<Integer>> arr) {
        if (memo[row][col] != null) return memo[row][col];

        int path = arr.get(row).get(col);
        memo[row][col] = path;
        if (row < arr.size() - 1) 
            memo[row][col] += Math.min(help(row + 1, col, arr), help(row + 1, col + 1, arr));

        return memo[row][col];
    }
//     public int minimumTotal2(List<List<Integer>> triangle) {
//         dp = new int [100][100];
        
//         return help(triangle, 0, 0);
        
//     }
    
//     int help(List<List<Integer>> arr, int row, int col) {
//         if(dp[row][col] > 0) return dp[row][col];
        
//         if(row == arr.size()-1) {
//             dp[row][col] = arr.get(row).get(col);
//         } else dp[row][col] = arr.get(row).get(col) + 
//             Math.min(
//             help(arr, row+1, col+1),
//             help(arr, row+1, col)
//         );
//         return dp[row][col];
//     }
}