class Solution {
    public boolean searchMatrix2(int[][] matrix, int target) {
        int top = 0, bottom = matrix.length-1, mid;
        int [] temp;
        while(top <= bottom) {
            mid = (top+bottom)/2;
            temp = matrix[mid];
            
            if(target >= temp[0] && target <= temp[matrix[0].length-1]) {
                top = 0;
                bottom = matrix[0].length-1;
                
                while(top <= bottom) {
                    mid = (top + bottom)/2;
                    if(target == temp[mid]) return true;
                    else if(target > temp[mid]) top = mid + 1;
                    else bottom = mid - 1;
                }
                break;
            } else if(target < temp[0]) bottom = mid -1;
            else top = mid + 1;
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int [] row: matrix) for(int ele: row) if(ele == target) return true;
        return false;
    }
}