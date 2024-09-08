//Rotate Matrix/Image by 90 Degrees

import java.util.*;
public class RotateMatrix {
    public static void rotateMatrix(int [][]mat){
        // Write your code here.
        int r=mat.length;
        int c=mat[0].length;

        for(int i=0;i<r-1;i++){
            for(int j=i+1;j<c;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<r;i++){
            reverse(mat[i]);
        }
    }

    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

    }
}