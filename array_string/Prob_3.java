/*Rotate an array. */

public class Prob_3 {

     public static void main(String[] args) {
        int[] arr={20,12,34,89,34,85,31};
        int k=3;
        rotate_array(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

    public static void rotate_array(int[] arr,int k){
        k=k%arr.length;
        reverse_array(arr,0,arr.length-1);
        reverse_array(arr,0,k-1);
        reverse_array(arr,k,arr.length-1);
    }

    public static void reverse_array(int arr[], int start, int end){
        int temp;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
   
}
