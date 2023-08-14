class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE, max2 = max, max3 = max;
        
        for(int ele: nums) {
                        
            if(ele == max3 || ele == max2 || ele == max) continue;
            
            if(ele >= max) {
                max3 = max2;
                max2 = max;
                max = ele;
            } else if(ele >= max2) {
                max3 = max2;
                max2 = ele;
            } else if(ele > max3) {
                max3 = ele;
            }
        }
        

        
        if(max3 == Long.MIN_VALUE) return (int)max;
        return (int)max3;
    }
}