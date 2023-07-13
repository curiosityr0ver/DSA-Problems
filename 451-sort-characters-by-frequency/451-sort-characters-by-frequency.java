class Solution {
     public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        String res = "";
        while (res.length() < s.length()) {
            char ch = highestFreq(hm);
            int max = hm.get(ch);
            while (max > 0) {
                res += ch;
                max--;
            }
            hm.remove(ch);
        }
        return res;
    }
    public char highestFreq(HashMap<Character, Integer> hm) {
        int max = 0;
        char val = 0;
        for (Map.Entry<Character, Integer> kEntry : hm.entrySet()) {
            if (max < kEntry.getValue()) {
                val = kEntry.getKey();
                max = kEntry.getValue();
            }
        }
        return val;
    }
}