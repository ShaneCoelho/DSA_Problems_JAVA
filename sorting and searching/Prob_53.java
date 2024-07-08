//Implement quicksort and analyze its time complexity.(Solved on Coding Ninjas)

import java.util.* ;
import java.io.*; 
public class Solution {

    public static int getPartition(int low, int high, List<Integer> arr){
        int pivot=arr.get(low);
        int i=low;
        int j=high;

        while(i<j){
            while(arr.get(i)<=pivot && i<=high-1){
                i++;
            }

            while(arr.get(j)>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, low, j);
        return j;
    }

    public static void qs(int low, int high, List<Integer> arr){
        if(low<high){
            int pIndex=getPartition(low,high,arr);
            qs(low,pIndex-1,arr);
            qs(pIndex+1,high,arr);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr){
        // Write your code here.

        qs(0,arr.size()-1,arr);
        return arr;
    }
}