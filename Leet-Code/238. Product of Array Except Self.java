class Solution {
    public int[] productExceptSelfUsingTwoArray(int[] nums) {
        int length = nums.length;
        int[] answersFromLeft = new int[length];
        int[] answersFromRight = new int[length];

        for(int i = 0, temp = 1; i< length; i++){
            answersFromRight[i] = temp;
            temp *= nums[i];
        }

        for(int i = length-1, temp = 1; i >=0; i-- ){
            answersFromLeft[i] = temp;
            temp *= nums[i];
        }

        for(int i =0; i< length; i++){
            nums[i] = answersFromLeft[i] * answersFromRight[i];
        }
        return nums;
    }
}
