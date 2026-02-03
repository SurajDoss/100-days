class Solution {
    public int hIndex(int[] citations) {
        int citationLen = citations.length;
        int[] citationCounter = new int[citationLen + 1];

        for(int i = 0; i < citationLen; i++){
            citationCounter[Math.min( citationLen, citations[i])]++;
        }

        int papers = 0;
        for(int i = citationLen; i >= 0; i--){
            papers += citationCounter[i];
            if( papers >= i ){
                return i;
            }
        }
        return papers;
    }
}
