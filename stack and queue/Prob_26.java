//Evaluate a postfix expression.

class Solution {
    Stack<Integer> stack;
    int result,op2,op1;

    public Solution(){
        stack=new Stack<>();
    }
    public int evalRPN(String[] tokens) {
        for(int i=0;i<tokens.length;i++){ //for String we make use of length() method and for array of string we make use of length proprty
            if(isOperator(tokens[i])){
                op2=stack.pop();
                op1=stack.pop();
                result=evaluateExpression(tokens[i],op1,op2);
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }

    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public int evaluateExpression(String operator, int op1, int op2){
        switch(operator){
            case "+":
            return op1+op2;

            case "-":
            return op1-op2;

            case "*":
            return op1*op2;

            case "/":
            if(op2==0){
                throw new IllegalArgumentException("Division by zero");
            }else{
                return op1/op2;
            }

            default:
                throw new IllegalArgumentException("Invalid operator"); //Compulsory put default
        }
    }
}