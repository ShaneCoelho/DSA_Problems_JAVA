import java.util.*;

public class Spiral {
    public static int[] spiralMatrix(int [][]MATRIX) {
        // Write your code here.
        if (MATRIX == null || MATRIX.length == 0 || MATRIX[0].length == 0) {
            return new int[0]; // return an empty array
        }
        
        int[][] mat=MATRIX;
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer> list=new ArrayList<>();

        int top=0;
        int right=m-1;
        int bottom=n-1;
        int left=0;

        while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            

            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(mat[i][left]);
                }
                left++;
            }


        }

        int[] ans=new int[list.size()];

        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}