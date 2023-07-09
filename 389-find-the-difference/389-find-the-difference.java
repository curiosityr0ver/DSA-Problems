class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int[] dict = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            dict[s.charAt(i)- 'a']++;
            // hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < t.length(); i++) {
            dict[t.charAt(i)- 'a']--;
            // hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        for(int i = 0; i < 26; i++) {
            if(dict[i] != 0) return (char) (i+ 'a');
        }
        
        // for(char key: hm.keySet()) {
        //     if(hm.get(key) != 0) return key;
        // }
        return '0';
    }
}