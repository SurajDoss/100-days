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

    public boolean isPalindromeRecursn(int x) {
        String a = x + "";
        return isPalindrome(0, a);
    }

    private static boolean isPalindrome(int right, String a){
        //.statement to end
        if( right == ( a.length() / 2 ) ){
            return true;
        }

        //statement to break in case of not equal
        if( a.charAt(right) != a.charAt( a.length() - right - 1 ) ){
            return false;
        }
        return isPalindrome(++right, a);
    }
}
