/**
we can use an int[] instead of this.
*/
class MinStack {
    Stack<Long> stack = new Stack<>();
    long min;

    public MinStack() {

    }
    
    public void push(int intVal) {
        Long val = Long.valueOf(intVal);
        if(stack.isEmpty()){
            stack.push(val);
            min = val;
        }else{
            if( min < val ){
                stack.push(val);
            }else{
                stack.push( ( 2 * val ) - min);
                min = val;
            }
        }
    }
    
    public void pop() {
        if( stack.isEmpty() ){
            return;
        }
        Long x = stack.peek();
        stack.pop();
        if( x < min){
            min = ( 2 * min ) - x;
        }
    }
    
    public int top() {
        if( stack.isEmpty() ){
            return -1;
        }

        long x = stack.peek();
        if( x >= min ){
            return (int) x;
        }
        return (int) min;
    }
    
    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
