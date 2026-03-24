class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> values = new Stack<>();

        for( String token : tokens ){
            if( isOperator(token) ){
                Integer num1 = Integer.valueOf( values.pop() );
                Integer num2 = Integer.valueOf( values.pop() );
                Integer result = 0;
                switch( token ){
                    case "*":
                        result = num2 * num1;
                    break;
                    case "-":
                        result = num2 - num1;
                    break;
                    case "+":
                        result = num2 + num1;
                    break;
                    case "/":
                        result = num2 / num1;
                    break;
                }

                values.push(Integer.toString(result));
            }else{
                values.push(token);
            }
        }

        return Integer.valueOf(values.peek());
    }

    private boolean isOperator(String operator){
        return operator.equals("+") || operator.equals("-") || operator.equals("/") || operator.equals("*");
    }
}
