class Solution {
    public int search(int[] nums, int target) {
        return rec(0, nums.length-1, nums, target);
    }
    
    public int rec(int left, int right, int [] nums, int tag){
        if(left>right) return -1;
        
        int mid = (left+right)/2;
        
        if(nums[mid] == tag)return mid;
        else if(nums[mid] > tag) return rec(left, mid-1, nums, tag);
        else return rec(mid+1, right, nums, tag);
    }
}