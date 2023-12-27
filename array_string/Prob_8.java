/* Implement strstr (substring search). */

public class Prob_8 {

    public static int find_substr(String str, String substr){
        if(str.length()<substr.length()){
            return -1;
        }

        for(int i=0;i<str.length()-substr.length();i++){
            int j;
            for(j=0;j<substr.length();j++){
                if(str.charAt(i+j)!=substr.charAt(j)){
                    break;
                }
            }
            if(j==substr.length()){
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
