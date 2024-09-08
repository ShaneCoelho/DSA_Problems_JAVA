import java.util.*;

public class CountIntegers {

    public static void getCount(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
        }
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size:");
        int n=sc.nextInt();

        System.out.println("Enter array:");

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        getCount(arr);
    }
}
