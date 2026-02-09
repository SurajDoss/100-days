class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while( i >=0 || j >= 0 || carry > 0 ){
            int currentSum = carry;

            if( i >= 0 ){
                currentSum = currentSum + ( a.charAt(i) - '0' );
                i--;
            }


            if( j >= 0 ){
                currentSum = currentSum + ( b.charAt(j) - '0' );
                j--;
            }

            sum.append( currentSum % 2 );
            carry = currentSum / 2;
        }

        return sum.reverse().toString();
    }
}
