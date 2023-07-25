class Solution {
    public int arrangeCoins(int n) {
        long sum = 0;
        
        for(int i = 0; i <= n; i++) {
            sum += i;
            
            if(sum > n) return i-1;
            if(sum == n) return i;
        }
        return -1;      
    }
}