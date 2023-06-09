class Solution {
    public int minFlips(int a, int b, int c) {
//         List<Integer> a1 = getBin(a);
//         List<Integer> b1 = getBin(b);
//         List<Integer> c1 = getBin(c);
//         int len = Math.max(a1.size(), Math.max(b1.size(), c1.size()));

//         while(a1.size() < len) a1.add(0);
//         while(b1.size() < len) b1.add(0);
//         while(c1.size() < len) c1.add(0);

        int res = 0;
//         for(int i = 0; i < len; i++) {
            
//            if(c1.get(i) == 0) {
//                res += a1.get(i) + b1.get(i);
               
//            } else {
//                if(a1.get(i) + b1.get(i) == 0) res++;
//            }
//         }
        int x, y, z;
        do {
            x = a%2;
            y = b%2;
            z = c%2;
            a /= 2;
            b /= 2;
            c /= 2;
            
            System.out.println(x + " or " + y + " = " + z);
            
           if(z == 0) {
               res += x + y;
               
           } else {
               if(x + y == 0) res++;
           }
        } while(a+b+c > 0);

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