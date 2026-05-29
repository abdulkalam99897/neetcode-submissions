class Solution {
    public int missingNumber(int[] nums) {
        int ex = 0;
        int ac = 0;
        for(int i = 0; i<=nums.length;i++){
            ex += i;
        }
        for(int i = 0; i<nums.length;i++){
            ac += nums[i];
        }

        return ex - ac;
    }
}
