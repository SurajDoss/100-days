class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 ){
            return false;
        }

        String s = x+"";
        int right = 0;
        int left = s.length()-1;
        while( right < left){
            if( s.charAt(right) != s.charAt(left) ){
                return false;
            }
            right++;
            left--;
        }

        return true;
    }
}
