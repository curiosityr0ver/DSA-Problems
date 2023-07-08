class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> temp = new TreeSet<>();
        
        for(int ele: nums) {
            temp.add(ele);
        } 
        int count = 0;   
        for(int ele: temp) {
            nums[count++] = ele;
        }
        return count;
    }
}