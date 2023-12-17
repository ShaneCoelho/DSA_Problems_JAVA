/*Reverse an array. */

public class Prob_2 {

    public static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int temp;

        while (i <= j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 56, 11, 89, 34, 21 , 67};
        if (arr.length == 0) {
            System.out.println("The array is empty");
            System.exit(0);
        }

        int[] rev_array = reverse(arr);
        System.out.println("The reversed array:");
        for(int x=0;x<rev_array.length;x++){
            System.out.println(rev_array[x]);
        }
    }
}