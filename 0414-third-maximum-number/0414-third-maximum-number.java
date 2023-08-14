class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE, max2 = max, max3 = max;
        
        System.out.println(max + ", " + max2 + ", " + max3);

        for(int ele: nums) {
                        
            System.out.println(max + ", " + max2 + ", " + max3);
            
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
        
        System.out.println(max + ", " + max2 + ", " + max3);

        
        if(max3 == Long.MIN_VALUE) return (int)max;
        return (int)max3;
    }
}