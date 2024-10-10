//Next Greater Element

class NextGreater
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> st=new Stack<>();
        long[] nge=new long[n];
        
        for(int i=n-1;i>=0;i--){
            
            while((!st.empty()) && (arr[i]>=st.peek())){
                st.pop();
            }
            
            if(st.empty()){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        
        return nge;
    } 
}