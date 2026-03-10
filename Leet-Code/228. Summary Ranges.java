class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        int i = 0;
        List<String> summaryRanges = new ArrayList<>();

        while(i < n){
            int start = nums[i];
            while( i + 1 < n && nums[i] + 1 == nums[i + 1] ){
                i++;
            }
            if( nums[i] == start ){
                summaryRanges.add( String.valueOf(start));
            }else{
                summaryRanges.add( start + "->" + nums[i] );
            }

            i++;
        }

        return summaryRanges;
    }
}
