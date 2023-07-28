class Solution {
    public boolean PredictTheWinner(int[] nums) {
        long sum=0;
        for(long x:nums) sum+=x;
        long one=win(nums,0,nums.length-1,0);
            sum-=one;
        return one>=sum;
    }
    
    public long win(int nums[],int left,int right,int cha)
    {
        if(left>right) return 0;
        if(cha==0)return Math.max(nums[left]+win(nums,left+1,right,1),nums[right]+win(nums,left,right-1,1));
        else return Math.min(win(nums,left+1,right,0),win(nums,left,right-1,0));             
    }
}
