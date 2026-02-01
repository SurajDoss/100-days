class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int length = words.length;
        StringBuilder revSentence = new StringBuilder();

        for( int i = length -1; i >=0; i-- ) {
            revSentence.append(words[i]);
            if(i != 0){
                revSentence.append(" ");
            }
        }

        return revSentence.toString();
    }
}
