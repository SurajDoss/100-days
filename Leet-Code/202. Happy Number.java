class Solution {
    public boolean isHappy(int n) {
        Set<Integer> nums = new HashSet<Integer>();

        while( n != 1 ){
            int currentNum = n;
            int sum = 0;

            while( currentNum != 0 ){
                int rem = currentNum % 10;
                sum += ( rem * rem );
                currentNum = currentNum / 10;
            }

            if( nums.contains(sum) ){
                return false;
            }

            nums.add(sum);
            n = sum;
        }

        return true;
    }
}
