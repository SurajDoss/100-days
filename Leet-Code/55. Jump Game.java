class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int maximumReach = nums[0];
        int lastPoint = nums.length - 1;

        for(int i = 1; i <= maximumReach; i++){
            maximumReach = Math.max(maximumReach, nums[i] + i);
            if( maximumReach >= lastPoint){
                return true;
            }
        }
        return false;
    }
}
