class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length;i++){
            if(i == candidate){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    candidate = i;
                    count++;
                }
            }
        }
        return candidate;
    }
}