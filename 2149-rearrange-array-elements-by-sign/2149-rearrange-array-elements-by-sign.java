class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int[] res = new int[nums.length];
        int count = 0, ptr1 = 0, ptr2 = 0;
        
        while(count < nums.length) {
            
            while(nums[ptr1] < 0) ptr1++;
            while(nums[ptr2] >= 0) ptr2++;
            res[count++] = nums[ptr1++];
            res[count++] = nums[ptr2++];
        }
        return res;
    }
}