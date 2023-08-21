class Solution {
    public boolean repeatedSubstringPattern(String s) {
     
        
        for(int i = 1;i < s.length(); i++) {
            if(s.length() % i > 0) continue;
            
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
    
    boolean isEqual(String s, int l, int r) {
        
        for(int i = 0; i < r; i++) {
            if(s.charAt(i) != s.charAt(i+l)) return false;
        }
        
        return true;
    }
}