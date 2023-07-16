class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            }else {
                neg.add(nums[i]);
            }
        }
        int ptr1 = 0, ptr2 = 0;
        int[] res = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            if(i%2 == 0) {
                res[i] = pos.get(ptr1++);
            } else {
                res[i] = neg.get(ptr2++);
            }
        }
        
        

        
        return res;
    }
}