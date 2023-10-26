class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        List<Integer> res = new ArrayList<>();
        
        int p1 = 0, p2 = 0;
        
        while(p1 < m && p2 < n) {
            if(nums1[p1] < nums2[p2]) {
                res.add(nums1[p1++]);
            } else {
                res.add(nums2[p2++]);
            }
        }
        
        while(p1 < m) {
            res.add(nums1[p1++]);
        }
        
        while(p2 < n) {
            res.add(nums2[p2++]);
        }
        
        
        
        for(int i = 0; i < res.size(); i++) {
            nums1[i] = res.get(i);
        }        
    }
}