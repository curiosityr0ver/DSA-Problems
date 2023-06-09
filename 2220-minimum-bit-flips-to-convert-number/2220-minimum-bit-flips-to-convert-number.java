class Solution {
    public int minBitFlips(int start, int goal) {
        
        int res = 0;
        
        while(start + goal > 0) {
            if(start%2 != goal%2) res++;
            
            start/= 2;
            goal /= 2;
        }
        return res;
    }
}