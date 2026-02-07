class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> bracketMap = new HashMap<Character, Character>();
        bracketMap.put('}', '{');
        bracketMap.put(')', '(');
        bracketMap.put(']', '[');
        Stack<Character> brackets = new Stack<Character>();


        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[' ){
                brackets.push(s.charAt(i));
            }else if(!brackets.isEmpty() && brackets.peek() == bracketMap.get(s.charAt(i))){
                brackets.pop();
            }else{
                return false;
            }
        }

        return brackets.isEmpty();
    }
}
