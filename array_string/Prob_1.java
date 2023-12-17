/* Find the maximum element in an array. */

public class Prob_1
{

    public static int find_max(int[] arr){
        if(arr.length==0)
        {
            return -1;
        }

        int max_element=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max_element){
                max_element=arr[i];
            }
        }

        return max_element;

    }
    public static void main(String[] args) {
        int[] arr={54,26,76,34,11,90};
        int max_element=find_max(arr);

        if(max_element==-1){
            System.out.println("The array is empty");
        }
        else{
            System.err.println("The Maximum element is:"+max_element);
        }

    }
}