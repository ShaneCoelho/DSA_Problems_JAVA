//Longest Increasing Subsequence

public class IncreasingSubsequence {

	public static int longestIncreasingSubsequence(int arr[]) {
		//Your code goes here
		int len=getSubLength(-1,0,arr);

		return len;
	}

	public static int getSubLength(int prev_index,int index, int arr[]){
		if(index==arr.length){
			return 0;
		}

		int length;

		length=0+getSubLength(prev_index, index+1, arr);

		if(prev_index==-1 || arr[index]>arr[prev_index]){
			length=Math.max(length,1+getSubLength(index, index+1, arr));
		}

		return length;
	}

}