class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }

        int jumpCounter = 0;
        int lastPoint = nums.length-1;
        int maxJumpLimit = 0;
        int currentFarLimit = 0;


        for(int i = 0; i <= lastPoint; i++){
            maxJumpLimit = Math.max( maxJumpLimit, i + nums[i] );

            if(i == currentFarLimit){
                currentFarLimit = maxJumpLimit;
                jumpCounter++;
            }

            if( currentFarLimit >= lastPoint ){
                return jumpCounter;
            }
        }
        return jumpCounter;
    }
}
