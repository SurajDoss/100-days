class Solution {
    public boolean isAnagram(String s, String t) {
        if( s.length() != t.length() ){
            return false;
        }

        int[] count = new int[26];
        for(int i =0; i< s.length(); i++){
            count[ s.charAt(i) - 'a']++;// for 'a' char 97 - 97 = 0, so in 0th index incrementing by 1
        }

        for(int i =0; i< t.length(); i++){
            count[t.charAt(i) - 'a']--; 
        }


        for(int i =0; i< count.length; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
