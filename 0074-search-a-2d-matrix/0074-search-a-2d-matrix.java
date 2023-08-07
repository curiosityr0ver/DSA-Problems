class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        
        while(top <= bottom) {
            int mid = (top+bottom)/2;
            
            int [] temp = matrix[mid];
            
            if(target >= temp[0] && target <= temp[matrix[0].length-1]) {
                
                top = 0;
                bottom = matrix[0].length-1;
                
                while(top <= bottom) {
                    mid = (top + bottom)/2;
                    
                    if(target == temp[mid]) {
                        return true;
                    } else if(target > temp[mid]) {
                        top = mid + 1;
                    } else {
                        bottom = mid - 1;
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