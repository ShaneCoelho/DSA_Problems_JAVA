/* Implement strstr (substring search). */

public class Prob_8 {

    public static int find_substr(String haystack, String needle){
        if(haystack.length()<needle.length()){
            return -1;
        }

        int n=haystack.length();
        int m=needle.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String str="aabaacaadaabaaabaa";
        String substr="aaba";

        int result=find_substr(str,substr);

        if(result==-1){
            System.out.println("No match found");
        }else{
            System.out.println("Match found at position:"+result);
        }
    }
}
