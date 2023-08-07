class Solution {
    
    public int fib(int n) {
        if(n < 2) return n;
        int a = 0, b = 1, c = 0;
        int i = 0;
        while(i++ < n-1) {
            // System.out.print(c + ", ");
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}