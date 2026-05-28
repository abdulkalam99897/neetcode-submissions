class Solution {
    public int maxSubArray(int[] nums) {
        int cusum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            cusum += nums[i];

            maxsum = Math.max(cusum,maxsum);
        
        if(cusum < 0){
            cusum = 0;
        }
        }
        return maxsum;
    }
}
