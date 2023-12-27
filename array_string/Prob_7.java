/*Implement an algorithm to check if a string is a palindrome. */


public class Prob_7 {

    public static boolean checkPalindrome(String str){
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
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
