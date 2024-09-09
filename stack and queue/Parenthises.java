//Valid Parentheses

class Parenthises {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();

        Stack<Character> st=new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='[' || arr[i]=='{' || arr[i]=='('){
                st.push(arr[i]);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                
                char ele=st.pop();

                if(arr[i]=='}' && ele=='{'){
                    continue;
                }else if(arr[i]==')' && ele=='('){
                    continue;
                }else if(arr[i]==']' && ele=='['){
                    continue;
                }else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()){
            return false;
        }

        return true;
    }
}