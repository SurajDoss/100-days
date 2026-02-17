class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String, List<String>> strVsList = new HashMap<String, List<String>>();

        for(String s : strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedString = new String(sArray);
            if( !strVsList.containsKey( sortedString ) ){
                strVsList.put(sortedString, new ArrayList<String>());
            }
            strVsList.get(sortedString).add(s);
        }

        result.addAll(strVsList.values());
        return result;
    }
}
