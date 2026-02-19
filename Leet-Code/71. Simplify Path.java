class Solution {
    public String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<>();
        String[] strArr = path.split("/");

        for( int i =0; i< strArr.length; i++ ){
            if( !pathStack.isEmpty() && strArr[i].equals(".." )){
                pathStack.pop();
            }else if( !strArr[i].equals(".") && !strArr[i].equals("..")&& !strArr[i].isEmpty()){
                pathStack.push(strArr[i]);
            }
        }

        if( pathStack.isEmpty() ){
            return "/";
        }

        StringBuilder result = new StringBuilder();

        while (!pathStack.isEmpty()) {
            result.insert(0, "/" + pathStack.pop());
        }
        
        return result.toString();
    }
}
