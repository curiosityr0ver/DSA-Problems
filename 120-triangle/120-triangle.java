class Solution {
    int [][] dp;
    private Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        memo = new Integer[n][n];
        return help(0, 0, triangle);
    }

    private int help(int level, int i, List<List<Integer>> triangle) {
        if (memo[level][i] != null) return memo[level][i];

        int path = triangle.get(level).get(i);
        if (level < triangle.size() - 1) 
            path += Math.min(help(level + 1, i, triangle), help(level + 1, i + 1, triangle));

        return memo[level][i] = path;
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