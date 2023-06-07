class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> result = new LinkedList<List<Integer>>();
        HashSet<String> hs = new HashSet<>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int max = nums[nums.length -1];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];
                    if (sum == target) {
                        List<Integer> temp = new LinkedList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        // result.add(temp);
                        String t1 = temp.get(0) + "," + temp.get(1) + "," + temp.get(2) + "," + temp.get(3);
                        if(!hs.contains(t1)) {
                            hs.add(t1);
                            result.add(temp);
                        }
                        int startVal = nums[start];
                        int endVal = nums[end];
                        while (start < end && startVal == nums[start]) {
                            start ++;
                        }
                        while (start < end && endVal == nums[end]) {
                            end --;
                        }
                    }
                    else if (sum < target) {
                        start ++;
                    }       
                    else {
                        end --;
                    }
                }
            }
        }
        return result;
    }
}