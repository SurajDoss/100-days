class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }

        List<StringBuilder> strings = new ArrayList<StringBuilder>();

        for(int i = 0;  i < numRows; i++){
            strings.add(new StringBuilder());
        }

        int row = 0;
        boolean goingDown=false;
        for(int i = 0; i < s.length(); i++){
            strings.get(row).append( s.charAt(i) );
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }
            row += goingDown ? 1 : -1;
        }

        StringBuilder value = new StringBuilder();
        for(int i = 0; i< strings.size(); i++){
            value.append(strings.get(i));
        }

        return value.toString();
    }
}
