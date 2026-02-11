class Solution {
    public boolean wordPattern(String pattern, String s) {
        int patternLength = pattern.length();
        String[] wordsArr = s.split(" ");
        if( patternLength != wordsArr.length ){
            return false;
        }

        HashMap<Character, String> charMap = new HashMap<Character, String>();
        HashSet<String> words = new HashSet<String>();

        for( int i =0; i < patternLength; i++){
            if( !charMap.containsKey( pattern.charAt(i) ) ){
                if(!words.contains(wordsArr[i])){
                    charMap.put(pattern.charAt(i) ,wordsArr[i]);
                    words.add(wordsArr[i]);
                }else{
                    return false;
                }
            }else if( charMap.containsKey( pattern.charAt(i) )){
                if(charMap.get(pattern.charAt(i) ).equals(wordsArr[i]) ){
                    continue;
                }else{
                    return false;
                }

            }
        }
        return true;
    }
}
