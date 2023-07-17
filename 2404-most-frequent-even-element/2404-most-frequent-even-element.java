class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int ele: nums) {
            if(ele%2==0) hm.put(ele, hm.getOrDefault(ele, 0)+1);
        }
        
        int freq = 0;
        int res = -1;
        
        for(int key: hm.keySet()) {
            if(hm.get(key) > freq || hm.get(key) == freq && key < res) {
                res = key;
                freq = hm.get(key);
            }
        }
        
        return res;
    }
}