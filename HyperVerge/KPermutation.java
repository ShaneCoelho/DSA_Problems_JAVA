import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class KPermutation {
    public static ArrayList<Integer>  kthPermutation(int n, int k) {
        // Write your code here
        ArrayList<Integer> numbers=new ArrayList<>();

        int fact=1;

        for(int i=1;i<n;i++){
            fact=fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        ArrayList<Integer> ans=new ArrayList<>();
        k=k-1;

        while(true){
            ans.add(numbers.get(k/fact));
            numbers.remove(k/fact);
            if(numbers.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/numbers.size();

        }

        return ans;
    }
}