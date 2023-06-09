class Solution {
    public int minFlips(int a, int b, int c) {

        int res = 0;
        
        do {

            
           if(c%2 == 0) res += a%2 + b%2; 
           else if(a%2 + b%2 == 0) res++;
            
            a /= 2;
            b /= 2;
            c /= 2;
        } while(a+b+c > 0);

        return res;
    }
}