class Solution {
    public int hammingDistance(int x, int y) {
        StringBuilder binx = new StringBuilder(), biny = new StringBuilder();
        
        while(x > 0) {
            binx.append(x%2);
            x = x/2;
        }

        while(y > 0) {
            biny.append(y%2);
            y = y/2;
        }
        
        int len = Math.max(binx.length(), biny.length());
        
        binx = binx.reverse();
        biny = biny.reverse();
        
        System.out.println(binx + ", " + biny);
        while(binx.length() < len) binx = binx.insert(0, "0");
        while(biny.length() < len) biny = biny.insert(0, "0"); 
        System.out.println(binx + ", " + biny);

        int res = 0;
        
        for(int i = 0; i < len; i++) if(binx.charAt(i) != biny.charAt(i)) res++; 
        

        
        return res;
    }
}