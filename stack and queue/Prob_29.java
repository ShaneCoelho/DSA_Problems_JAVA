//Implement a function to sort a stack.

//This is using recursion

/*Complete the function below*/
class GfG {
    
    public void sortedStack(Stack<Integer> s, int num){
        if(s.isEmpty() || (!s.isEmpty() && s.peek() <= num )){
            s.push(num);
            return;
        }
        
        int n=s.peek();
        
        s.pop();
        
        sortedStack(s,num);
        
        s.push(n);
    }
    
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        
        //base condition
        if(s.isEmpty()){
            return s;
        }
        
        int num=s.peek();
        s.pop();
        
        sort(s);
        
        sortedStack(s,num);
        
        return s;
    }
}