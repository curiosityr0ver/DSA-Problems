class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            int position = rec(0, arr.length-1, arr, arr[i]*2);
            if(position != i && position >= 0)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public int rec(int left, int right, int [] nums, int tag){
        if(left>right) return -1;
        
        int mid = (left+right)/2;
        
        if(nums[mid] == tag)return mid;
        else if(nums[mid] > tag) return rec(left, mid-1, nums, tag);
        else return rec(mid+1, right, nums, tag);
    }
}