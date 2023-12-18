/*Implement an algorithm to determine if a string has all unique characters.*/

public class Prob_5 {

    public static void unique_character(String str){
        for(int i=1;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)&&i!=j){
                    System.out.println("The string does not contain unique characters");
                    System.exit(0);
                }
            }
        }
        System.out.println("The string has unique characters");
    }
    public static void main(String[] args) {
        String str="aabgcde";
        unique_character(str);
    }
}
