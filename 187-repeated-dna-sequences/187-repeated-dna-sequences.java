class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 10) return new ArrayList<String>(); 
        Set<String> hm = new HashSet<>(), res = new HashSet<>();
        
        hm.add(s.substring(0,10));
        String temp;
        for(int i = 1; i < s.length()-9; i++) {
            temp = s.substring(i, i+10);
            if(hm.contains(temp))  res.add(temp);
            else hm.add(temp);
        }                    
        return new ArrayList<>(res);            
    }
}