class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minValue = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int right = 0 ; right < nums.length; right++ ){
            sum += nums[right];
            while( sum >= target ){
                minValue = Math.min( minValue, right - left + 1 );
                sum -= nums[left];
                left++;
            }
        }

        return (minValue == Integer.MAX_VALUE) ? 0 : minValue;
    }
}
