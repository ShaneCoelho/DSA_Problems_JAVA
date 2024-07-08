//Find the peak element in an array.

import java.util.ArrayList;
public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // Write your code here.
        int n=arr.size();
        if(n==1){
            return 0;
        }
        if(arr.get(0)>arr.get(1)){
            return 0;
        }
        if(arr.get(n-1)>arr.get(n-2)){
            return n-1;
        }

        int low=1;
        int high=n-2;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1)){
                return mid;
            }else if(arr.get(mid)<arr.get(mid+1)){
                low=mid+1;
            }else if(arr.get(mid)>arr.get(mid+1)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return -1; // This wont be executed because there will always be a peek element in the array
    }
};
