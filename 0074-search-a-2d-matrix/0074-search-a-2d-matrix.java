class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        
        while(top <= bottom) {
            int mid = (top+bottom)/2;
            
            int [] temp = matrix[mid];
            
            if(target >= temp[0] && target <= temp[matrix[0].length-1]) {
                
                int left = 0;
                int right = matrix[0].length-1;
                int center = (left+right)/2;
                
                while(left <= right) {
                    mid = (left + right)/2;
                    
                    if(target == temp[mid]) {
                        return true;
                    } else if(target > temp[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                break;
            } else if(target < temp[0]) {
                bottom = mid -1;
            } else {
                top = mid + 1;
            }
        
        }
        return false;
    }
}