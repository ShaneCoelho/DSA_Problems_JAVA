// Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ 
// represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ 
// represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.

import java.util.*;



public class Aug_2022_1 {

    public static int compute(int r, int unit, int n, int[] arr){
        if(n==0){
            return -1;
        }

        int a=r*unit;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];

            if(sum>=a){
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter r:");
        int r=sc.nextInt();
        System.out.println("Enter unit:");
        int unit=sc.nextInt();
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter arr:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Output:");
        System.out.println(compute(r,unit,n,arr));
    }
}
