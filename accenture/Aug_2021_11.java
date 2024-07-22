// Problem Statement

// You are given a function,

// Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

// The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and 
// return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in 
// original string are replaced by ‘ch1’.

// Assumption: String Contains only lower-case alphabetical letters.

// Note:

// Return null if string is null.
// If both characters are not present in string or both of them are same , then return the string unchanged.
// Example:

// Input:
// Str: apples
// ch1:a
// ch2:p
// Output:
// paales
// Explanation:

// ‘A’ in original string is replaced with ‘p’ and ‘p’ in original string is replaced with ‘a’, thus output is paales.

import java.util.Scanner;

public class Aug_2021_11 {

    public static String ReplaceCharacter(String str, int n, char ch1, char ch2){
        if(str==null){
            return null;
        }

        String result="";

        for(int i=0;i<n;i++){
            if(str.charAt(i)==ch1){
                result=result+ch2;
            }else if(str.charAt(i)==ch2){
                result=result+ch1;
            }else{
                result=result+str.charAt(i);
            }
        }

        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter string:");

        String str=sc.next();

        System.out.println("Enter ch1:");
        char ch1=sc.next().charAt(0);

        System.out.println("Enter ch1:");
        char ch2=sc.next().charAt(0);

        int n=str.length();

        System.out.println("Output:"+ReplaceCharacter(str,n,ch1,ch2));
    }
}
