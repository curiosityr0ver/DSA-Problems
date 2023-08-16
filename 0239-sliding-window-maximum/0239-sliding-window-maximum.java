class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int ind = 0;

        for(int i = 0; i < k; i++)
            if(max <= nums[i]){
                ind = i;
                max = nums[i];
            }

        list.add(max);

        int i = 1;
        int j = i+k-1;

        while(j < nums.length){
            if(ind >= i && max > nums[j]){
                list.add(max);
            }
            else if(ind >= i && max <= nums[j]){
                ind = j;
                max = nums[j];
                list.add(max);
            }
            else if(ind < i){
                int tempMax = Integer.MIN_VALUE;

                for(int l = i; l <= j; l++)
                    if(tempMax <= nums[l]){
                        tempMax = nums[l];
                        ind = l;
                    }

                max = tempMax;
                list.add(max);
            }

            i++;
            j++;
        }

        int[] res = new int[list.size()];

        for(int x = 0; x < list.size(); x++)
            res[x] = list.get(x);

        return res;
    }
}