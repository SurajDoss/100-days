class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = columnTitle.charAt(0) - 'A' + 1;
        int pow = 26;
        int length = columnTitle.length();
        int value = 0;
        for ( int i = 1; i < length; i++ ){
            value = columnTitle.charAt(i) - 'A' + 1;
            ans = ans * pow;
            ans = value + ans;
        }
        return ans;
    }
}
