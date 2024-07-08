// Implement an algorithm to find the majority element in an array.

public class Solution {
    public static int majorityElement(int []v) {
        // Write your code here
        int count=0;
        int ele=0;

        for(int i=0;i<v.length;i++){
            if(count==0){
                ele=v[i];
                count++;
            }else if(v[i]==ele){
                count++;
            }else{
                count--;
            }
        }

        //implement this part of code only if they have not mentioned "It is guaranteed that the array 'a' always has a majority element." else directly return ele
        int count2=0;

        for(int i=0;i<v.length;i++){
            if(v[i]==ele){
                count2++;
            }
        }

        if(count2>v.length/2){
            return ele;
        }

        return -1;
    }
}