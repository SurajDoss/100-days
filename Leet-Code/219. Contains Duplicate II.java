class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> valueVsIndex = new HashMap<Integer, Integer>();
        
        for(int i =0; i < nums.length; i++){
            if( !valueVsIndex.containsKey( nums[i] ) ){
                valueVsIndex.put( nums[i], i );
            }else{
                int diff = Math.abs(  valueVsIndex.get( nums[i] ) - i );
                if( diff <= k ){
                    return true;
                }else{
                    valueVsIndex.put( nums[i], i );
                }
            }
        }

        return false;
    }
}
