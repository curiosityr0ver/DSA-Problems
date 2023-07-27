class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() < 10) return res; 
        
        HashSet<String> hm = new HashSet<>();
        
        String temp = s.substring(0,10);
        hm.add(temp);

        for(int i = 10; i < s.length(); i++) {
            temp = temp.substring(1) +  s.charAt(i);
            if(hm.contains(temp) && !res.contains(temp))  res.add(temp);
            else hm.add(temp);
        }                    
        return res;            
    }
}