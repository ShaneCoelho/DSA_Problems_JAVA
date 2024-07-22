// Problem Statement

// A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

// You are required to implement the following function.

// Int NumberOfCarries(int num1 , int num2);

// The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries 
// generated while adding digits of two numbers ‘num1’ and ‘ num2’.

// Assumption: num1, num2>=0

// Example:

// Input
// Num 1: 451
// Num 2: 349
// Output
// 2

import java.util.Scanner;

public class Aug_2021_10 {

    public static int NumberOfCarries(int num1, int num2){
        int carry=0;
        int count=0;

        String s1=""+num1;
        String s2=""+num2;

        int l;


        if(s1.length()>=s2.length()){
            l=s2.length()-1;
        }else{
            l=s1.length()-1;
        }

        for(int i=0;i<=l;i++){
            int d1=(int)(s1.charAt(l-i));
            int d2=(int)(s2.charAt(l-i));

            int sum=d1+d2+carry;

            if(sum>9){
                carry=1;
                count++;
            }else{
                carry=0;
            }

        }

        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num1:");
        int num1=sc.nextInt();

        System.out.println("Enter the num2:");
        int num2=sc.nextInt();

        System.out.println("Output:"+NumberOfCarries(num1,num2));
    }
}
