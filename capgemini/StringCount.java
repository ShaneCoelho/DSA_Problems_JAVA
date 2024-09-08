import java.util.*;

public class StringCount {

    public static String getCount(String str){
        char[] arr=str.toCharArray();
        int count=1;
        String ans=""+arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                if(count==1){
                    ans=ans+arr[i];
                }else{
                    ans=ans+count+arr[i];
                    count=1;
                }
            }
        }

        if(count!=1){
            ans=ans+count;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String input=sc.next();
        System.out.println("Output:"+getCount(input));
    }
}
