/*Rotate an array. */



// Left Rotate an Array by One

import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp=arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

        return arr;

    }
}


//Rotate the array to the left by 'k' steps

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k=k%arr.size();

        if(k==0){
            return arr;
        }
        
        int[] temp=new int[k];

        for(int i=0;i<k;i++){
            temp[i]=arr.get(i);
        }

        for(int i=k;i<arr.size();i++){
            arr.set(i-k,arr.get(i));
        }

        for(int i=arr.size()-k;i<arr.size();i++){
            arr.set(i,temp[i+k-arr.size()]);
        }

        return arr;
    }
}

//Rotate the array to the right by k steps

class Solution {
    public void rotate(int[] nums, int k) {

        k=k%nums.length;
        int n=nums.length;

        if(k==0){
            return;
        }

        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
        
    }

    public static void reverse(int[] nums, int start, int end){
        int temp;


        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
    }

}