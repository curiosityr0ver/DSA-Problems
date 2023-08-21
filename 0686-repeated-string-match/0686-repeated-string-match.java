class Solution {
    public int repeatedStringMatch(String a, String b) {
        String temp = a;
        
        while(a.length() < b.length()) a += temp;
        
//         for(int i = 1; i < 2; i++) {
            
//             if(isSubs(a,b)) return a.length()/temp.length();            
//             a += temp;
//         }
        if(isSubs(a,b)) return a.length()/temp.length();            
        a += temp;
        if(isSubs(a,b)) return a.length()/temp.length();            
        // a += temp;
        
       return -1; 
    }
    
    boolean isSubs(String parent, String child) {
            
        for(int i = 0; i < parent.length() - child.length()+1; i++) {
            if(parent.charAt(i) != child.charAt(0)) continue;
            if(equals(parent, child, i)) return true;
        }
        return false;
    }
    
    boolean equals(String s1, String s2,int exp) {
        
        for(int i = 0; i < s2.length(); i++) if(s1.charAt(i+exp) != s2.charAt(i)) return false;
        
        
        return true;
    }
}