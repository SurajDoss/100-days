class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charVsCount = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++){
            if( charVsCount.containsKey(magazine.charAt(i)) ){
                charVsCount.put( magazine.charAt(i), charVsCount.get(magazine.charAt(i)) + 1 );
            }else{
                charVsCount.put( magazine.charAt(i), 1 );
            }
        }
        
        int letterCounter = 0;
        for( int i = 0; i < ransomNote.length(); i++){
            if( charVsCount.containsKey( ransomNote.charAt(i) ) && charVsCount.get(ransomNote.charAt(i)) > 0 ){
                letterCounter++;
                charVsCount.put( ransomNote.charAt(i), charVsCount.get(ransomNote.charAt(i)) - 1 );
            }else{
                break;
            }
        }   
        return letterCounter == ransomNote.length() ;
    }
}
