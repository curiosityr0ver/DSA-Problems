class Solution {
     public String frequencySort(String s) {
        // creqate the hashmap with key characters and value integers
        HashMap<Character, Integer> map = new HashMap<>();
        // put with the frequency in map
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        // while not > than length just append the most frequent character in sb
        while (sb.length() < s.length()) {
            // find the most frequent character
            char c = maxChar(map);
            int max = map.get(c);
            while (max > 0) {
                // append until max > 0
                sb.append(c);
                max--;
            }
            // now remove that most frequent element from map
            map.remove(c);
        }
        return sb.toString();
    }
    public char maxChar(HashMap<Character, Integer> map) {
        int max = 0;
        char val = 0;
        for (Map.Entry<Character, Integer> kEntry : map.entrySet()) {
            if (max < kEntry.getValue()) {
                val = kEntry.getKey();
                max = kEntry.getValue();
            }
        }
        return val;
    }
}