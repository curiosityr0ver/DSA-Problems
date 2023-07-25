class Solution {
    public int peakIndexInMountainArray2(int[] arr) {
        
        for(int i = 1; i < arr.length-1; i++) if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) return i;
        

        return -1;
    }
    
    public int peakIndexInMountainArray(int[] arr) {
        
        int mid, left = 0, right = arr.length-1;
        
        while(left < right) {
            mid = (left + right)/2;
            
            if(arr[mid] < arr[mid + 1]) left =  mid + 1;
            else right = mid;
        }
        
       return left;
    }
}