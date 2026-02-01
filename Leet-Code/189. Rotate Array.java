class Solution {
    public void rotate(int[] nums, int k) {
        int arrLength = nums.length;

        if( k > arrLength ) {
            k = k % arrLength;
        }

        reverseArray( 0, arrLength - 1, nums );
        reverseArray( 0, k - 1, nums );
        reverseArray( k, arrLength - 1, nums);
    }
    
    public static void reverseArray( int start, int end, int[] nums){
        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            end--;
            start++;
        }
    }



}
