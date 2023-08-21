class Solution {
    public boolean repeatedSubstringPattern(String s) {
     
        
        for(int i = 1;i < s.length(); i++) {
            if(s.length() % i > 0) continue;
            
            String temp = s.substring(0, i);
            boolean res = true;
            for(int j = i; j < s.length(); j+=i) {
                if(!isEqual(s, i, j)) {
                    res = false;
                    break;
                } 
            } 
            if(res) return true;
        }
        return false;
    }
    
    boolean isEqual(String s, int r1, int l2) {
        String s1 = s.substring(0, r1);
        String s2 = s.substring(l2, r1+l2);
        
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        
        return true;
    }
}