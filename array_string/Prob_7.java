/*Implement an algorithm to check if a string is a palindrome. */


public class Prob_7 {

    public static boolean checkPalindrome(String str){
        if(str.length()==1){
            return true;
        }
        
        int i=0;
        int j=str.length()-1;
        
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;

    }
    public static void main(String[] args) {
        String str="madam";
        boolean result=checkPalindrome(str);
        if(result){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }
}
