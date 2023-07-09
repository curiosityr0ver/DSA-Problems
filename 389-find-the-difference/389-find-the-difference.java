class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(char key: hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
        
        for(int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        
        System.out.println("****************");
        for(char key: hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
        
        for(char key: hm.keySet()) {
            if(hm.get(key) != 0) return key;
        }
        return '0';
    }
}