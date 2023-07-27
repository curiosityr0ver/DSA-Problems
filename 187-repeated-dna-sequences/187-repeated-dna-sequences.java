class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> hm = new HashSet<>();
        Set <String> res = new HashSet<>();
        if(s.length() < 10) return new ArrayList<>(res); 
        
        
        String temp = s.substring(0,10);
        hm.add(temp);

        for(int i = 10; i < s.length(); i++) {
            temp = temp.substring(1) +  s.charAt(i);
            if(hm.contains(temp))  res.add(temp);
            else hm.add(temp);
        }                    
        return new ArrayList<>(res);            
    }
}