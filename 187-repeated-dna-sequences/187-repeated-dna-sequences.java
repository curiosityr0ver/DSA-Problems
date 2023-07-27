class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 10) return new ArrayList<String>(); 
        Set<String> hm = new HashSet<>(), res = new HashSet<>();
        

        for(int i = 0; i < s.length()-9; i++) {
            if(hm.contains(s.substring(i, i+10)))  res.add(s.substring(i, i+10));
            else hm.add(s.substring(i, i+10));
        }                    
        return new ArrayList<>(res);            
    }
}