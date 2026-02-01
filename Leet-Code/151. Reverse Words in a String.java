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

    public String reverseWordsWOSubString(String s) {
        int length = s.length();
        StringBuilder revSentence = new StringBuilder();

        for( int i = length -1; i >=0; i-- ) {
            while( i>= 0 && s.charAt(i) == ' ' ){
                i--;
            }
            if(i < 0){
                break;
            }
            int endPoint = i;

            while( i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            revSentence.append( s.substring( i + 1, endPoint + 1) ).append(" ");
        }

        return revSentence.toString().trim();
    }
}
