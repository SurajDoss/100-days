class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        int maxConsecutive = 0;
        for( int n : nums ){
            numsSet.add(n);
        }

        for( Integer n : numsSet ){
            if( !numsSet.contains( n - 1 ) ){
                int count = 1;
                int currentValue = n;
                while( numsSet.contains( currentValue + 1 ) ){
                    count++;
                    currentValue = currentValue + 1;
                }
                maxConsecutive = Math.max( count, maxConsecutive );

            }
        }

        return maxConsecutive;
    }
}
