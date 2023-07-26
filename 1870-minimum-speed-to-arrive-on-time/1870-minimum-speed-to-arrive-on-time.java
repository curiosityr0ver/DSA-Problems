class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if((double) dist.length -1 > hour) return -1;
        int left = 0, right = 10000000;
        int ans = -1;
        
        
        while(left <= right) {
            int mid = (left+right)/2;
            if(isEnough(dist, mid, hour)) {
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return ans;
    }
    
    boolean isEnough(int [] dist, int speed, double hour) {
        double time = 0;
        for(double d: dist) time = Math.ceil(time) + d/speed;
        return (time <= hour); 
    }
}