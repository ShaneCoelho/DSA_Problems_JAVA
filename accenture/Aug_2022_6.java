// You are required to implement the following Function 

// def LargeSmallSum(arr)

// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from 
// the even positions and second smallest from the odd position of given ‘arr’

// Assumption:

// All array elements are unique
// Treat the 0th position as even
// NOTE

// Return 0 if array is empty
// Return 0, if array length is 3 or less than 3

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aug_2022_6 {

    public static int LargeSmallSum(int[] arr){
        if(arr.length<=3){
            return 0;
        }

        ArrayList<Integer> odd=new ArrayList<Integer>();
        ArrayList<Integer> even=new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            if((i+1)%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(odd);
        Collections.sort(even);

        return even.get(even.size()-2) + odd.get(1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length:");
        int n=sc.nextInt();

        System.out.println("Enter the array:");

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Output:"+LargeSmallSum(arr));
    }
}
