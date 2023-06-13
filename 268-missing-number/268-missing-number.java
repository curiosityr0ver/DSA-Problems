class Solution {
    public int missingNumber(int[] nums) {
      
        int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
        
//         HashSet<Integer> hsh = new HashSet<>();
        
//         for(int ele: nums) {
//             hsh.add(ele);
//         }
        
//         for(int i = 0; i <= nums.length; i++) {
//             if(!hsh.contains(i)) return i;
            
//         }
//         return -1;
    }
}