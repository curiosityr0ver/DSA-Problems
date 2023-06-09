class Solution {
    public int minFlips(int a, int b, int c) {
        List<Integer> a1 = getBin(a);
        List<Integer> b1 = getBin(b);
        List<Integer> c1 = getBin(c);
        int len = Math.max(a1.size(), Math.max(b1.size(), c1.size()));

        while(a1.size() < len) a1.add(0);
        while(b1.size() < len) b1.add(0);
        while(c1.size() < len) c1.add(0);

        int res = 0;
        for(int i = 0; i < len; i++) {
            int x = a1.get(i);
            int y = b1.get(i);
            int z = c1.get(i);

            if(x == 1 && y == 0 && z == 0) res++;
            if(x == 0 && y == 1 && z == 0) res++;
            if(x == 1 && y == 1 && z == 0) res+=2;
            if(x == 0 && y == 0 && z == 1) res++;

        }

        return res;
    }
    
    List<Integer> getBin(int n) {
        List<Integer> res = new ArrayList<>();
        
        while(n > 0) {
            res.add(n%2);
            n /= 2;
        } 
        return res;
    }
}