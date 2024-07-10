/*Implement an algorithm to determine if a string has all unique characters.*/

public class Prob_5 {

    public static void unique_character(String str){

        boolean[] arr=new boolean[128];
        int i;

        for(i=0;i<str.length();i++){
            int asci=str.charAt(i);

            if(arr[asci]==false){
                arr[asci]=true;
            }else{
                System.out.println("The string has repeated characters");
                break;
            }
        }

        if(i==str.length()){
            System.out.println("The string has unique characters");
        }
    }
    public static void main(String[] args) {
        String str="abgcdee";
        unique_character(str);
    }
}
