class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        int left = 0;
        int right = 0;
        int maxLen = 0;

        int strLen = s.length();
        int currentMaxLen = 0;
        while( right < strLen ){
            if( hash[ s.charAt( right ) ] != -1 ){
                if( hash[ s.charAt( right ) ] >= left){
                    left = hash[ s.charAt( right ) ] + 1;
                }
            }

            currentMaxLen = right - left + 1;
            maxLen = Math.max( currentMaxLen, maxLen);
            hash[ s.charAt( right ) ] = right;
            right++;
        }

        return maxLen;
    }
}
