/* Find the maximum element in an array. */

import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int maxElement=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }

        return maxElement;

    }
}