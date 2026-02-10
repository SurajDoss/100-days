class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<Character, Character>();
        Set<Character> usedChar = new HashSet<Character>();

        for(int i = 0; i < s.length(); i++){
            if( charMap.containsKey(s.charAt(i))){
                if( charMap.get(s.charAt(i)).equals( t.charAt(i) )){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(usedChar.contains(t.charAt(i))){
                    return false;
                }
                charMap.put( s.charAt(i), t.charAt(i) );
                usedChar.add(t.charAt(i));
            }
        }

        return true;
    }
}
