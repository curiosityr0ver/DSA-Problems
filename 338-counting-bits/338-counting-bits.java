class Solution {
    public int[] countBits(int n) {
        toBin(10);
        int [] res = new int[n+1];
        for(int i = 0; i <= n; i++) {
            res[i] = toBin(i);
        }
        return res;
    }
    
    int toBin(int n) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        while(n > 0) {
            res.append(n%2);
            if(n%2 == 1) {
                count++;
            }
            n/=2;
        }
      System.out.println(res);
      return count;
    }
}