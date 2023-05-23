class KthLargest {
    List<Integer> arr;
    int ind;
    public KthLargest(int k, int[] nums) {
        arr = new ArrayList<>();
        for(int ele: nums) arr.add(ele);
        ind = k;
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr, Collections.reverseOrder());
        return arr.get(ind-1);
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */