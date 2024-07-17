// Implement the following Function

// def ProductSmallestPair(sum, arr)

// The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, 
// Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

// NOTE

// Return -1 if array is empty or if n<2
// Return 0, if no such pairs found
// All computed values lie within integer range

import java.util.Collections;
import java.util.Scanner;

public class Aug_2022_7 {

    public static int ProductSmallestPair(int sum, int[] arr){
        if(arr.length<2){
            return -1;
        }

        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int check=arr[0]+arr[1];

        if(check<=sum){
            return arr[0]*arr[1];
        }

        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter sum:");
        int sum=sc.nextInt();

        System.out.println("Enter length:");
        int n=sc.nextInt();

        System.out.println("Enter arr:");

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Output:"+ProductSmallestPair(sum,arr));
    }
}
