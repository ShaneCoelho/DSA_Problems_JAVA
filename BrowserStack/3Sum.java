import java.util.* ;
import java.io.*; 
public class 3Sum {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.

		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

		Arrays.sort(arr);

		for(int i=0;i<n;i++){
			if(i>0 && (arr[i]==arr[i-1])){
				continue;
			}

			int j=i+1;
			int l=n-1;

			while(j<l){
				int sum=arr[i]+arr[j]+arr[l];
				if(sum>K){
					l--;
				}else if(sum<K){
					j++;
				}else{
					ArrayList<Integer> list=new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[l]);
					ans.add(list);
					j++;
					l--;
					while((j<l)&&(arr[j]==arr[j-1])){
						j++;
					}
					while((l>j)&&(arr[l]==arr[l+1])){
						l--;
					}
				}
			}
		}

		return ans;


	}
}
