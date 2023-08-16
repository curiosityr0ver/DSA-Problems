class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] list = new int[nums.length - k + 1];
        int max = Integer.MIN_VALUE;
        int ind = 0, count = 0;

        for(int i = 0; i < k; i++)
            if(max <= nums[i]){
                ind = i;
                max = nums[i];
            }

        list[count++] = max;

        int i = 1;
        int j = i+k-1;

        while(j < nums.length){
            if(ind >= i && max > nums[j]){
            list[count++] = max;
            }
            else if(ind >= i && max <= nums[j]){
                ind = j;
                max = nums[j];
            list[count++] = max;
            }
            else if(ind < i){
                int tempMax = Integer.MIN_VALUE;

                for(int l = i; l <= j; l++)
                    if(tempMax <= nums[l]){
                        tempMax = nums[l];
                        ind = l;
                    }

                max = tempMax;
            list[count++] = max;
            }

            i++;
            j++;
        }

        return list;
    }
}