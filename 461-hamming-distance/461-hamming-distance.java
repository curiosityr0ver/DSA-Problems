class Solution {
    public int hammingDistance(int x, int y) {
        String binx = "", biny = "";
        
        while(x > 0) {
            binx = x%2 + binx;
            x = x/2;
        }

        while(y > 0) {
            biny = y%2 + biny;
            y = y/2;
        }
        

        int len = Math.max(binx.length(), biny.length());
        while(binx.length() < len) binx = "0" + binx;
        while(biny.length() < len) biny = "0" + biny;
        
        int res = 0;
        
        for(int i = 0; i < len; i++) {
            System.out.println(binx.charAt(i) + ", " + biny.charAt(i));
           if(binx.charAt(i) != biny.charAt(i)) res++; 
        }

        
        return res;
    }
}