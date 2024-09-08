import java.util.*;

public class Hash {

    public static String shiftHash(String str){
        char[] arr=str.toCharArray();
        String hash="";
        String nothash="";

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='#'){
                hash=hash+arr[i];
            }else{
                nothash=nothash+arr[i];
            }
        }

        return hash+nothash;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input:");
        String input=sc.next();
        System.out.println("String:"+shiftHash(input));
    }
}
