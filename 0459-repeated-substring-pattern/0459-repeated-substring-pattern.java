class Solution {
    public boolean repeatedSubstringPattern(String s) {
     
        
        for(int i = 1;i < s.length(); i++) {
            if(s.length() % i != 0) continue;
            
            String temp = s.substring(0, i);
            boolean res = true;
            for(int j = i; j < s.length(); j+=i) {
                if(!temp.equals(s.substring(j, j+i))) res = false;
                // System.out.print(temp.equals(s.substring(j, j+i))+ ", ");
            } 
            // System.out.println(temp + ": " + res);
            if(res) return true;
        }
        
        return false;
    }
}