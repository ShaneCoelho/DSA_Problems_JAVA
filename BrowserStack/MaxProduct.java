import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class MaxProduct {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int suffix=1;
		int prefix=1;
		int max=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			suffix=suffix*arr.get(n-i-1);
			prefix=prefix*arr.get(i);

			max=Math.max(max,Math.max(prefix,suffix));

			if(prefix==0){
				prefix=1;
			}

			if(suffix==0){
				suffix=1;
			}
		}

		return max;
	}
}