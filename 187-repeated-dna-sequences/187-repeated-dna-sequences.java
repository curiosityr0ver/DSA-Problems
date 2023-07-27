class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s.length() < 10) return res; 
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        String temp = s.substring(0,10);
        hm.put(temp, hm.getOrDefault(temp, 0) + 1);

        for(int i = 10; i < s.length(); i++) {
            temp = temp.substring(1) +  s.charAt(i);
            hm.put(temp, hm.getOrDefault(temp, 0) + 1);
        }        
        for(String key: hm.keySet()) if(hm.get(key) > 1) res.add(key);
            
        return res;            
    }
}