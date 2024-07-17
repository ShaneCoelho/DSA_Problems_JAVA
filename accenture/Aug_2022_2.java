// Problem Description :
// The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the 
// following function:

// int OperationsBinaryString(char* str);

// The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

// Note:

// No order of priorities of operations is required
// Length of str is odd
// If str is NULL or None (in case of Python), return -1

import java.util.Scanner;

public class Aug_2022_2 {

    public static int compute(String str){
        if(str==null){
            return -1;
        }

        int result=str.charAt(0)-'0';

        int i=1;
        while(i<str.length()){
            if(str.charAt(i)=='A'){
                result=result & (str.charAt(i+1)-'0');
            }else if(str.charAt(i)=='B'){
                result=result | (str.charAt(i+1)-'0');
            }else{
                result=result ^ (str.charAt(i+1)-'0');
            }

            i=i+2;
        }

        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string:");
        String str=sc.nextLine();

        System.out.println("Output:"+compute(str));

    }
}
