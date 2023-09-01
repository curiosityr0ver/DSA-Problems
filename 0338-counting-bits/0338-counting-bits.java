class Solution {
    public int[] countBits(int n) {
        int [] res = new int[n+1];
        for(int i = 0; i <= n; i++) {
            res[i] = toBin(i);
        }
        return res;
    }
    
    int toBin(int n) {
        int count = 0;
        while(n > 0) {
            if(n%2 == 1) {
                count++;
            }
            n/=2;
        }
      return count;
    }
}