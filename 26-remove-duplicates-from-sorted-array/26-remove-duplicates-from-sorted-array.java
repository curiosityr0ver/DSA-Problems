class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        
        arr.add(nums[0]);
        for(int i = 1; i < nums.length; i++)  {
            if(nums[i] != nums[i-1]) {
                arr.add(nums[i]);
            }
        }
        
        int count = 0;   
        for(int ele: arr) {
            nums[count++] = ele;
        }
        return count;            
    }
}