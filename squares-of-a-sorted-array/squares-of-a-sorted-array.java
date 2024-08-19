class Solution {
    public int[] sortedSquares(int[] nums) {
        int index = 0;
        
        for(int ele: nums) {
            nums[index++] = ele*ele;
        }
        Arrays.sort(nums);
        return nums;
    }
}