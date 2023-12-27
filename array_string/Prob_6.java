/*Check if two strings are anagrams. */

import java.util.*;

public class Prob_6 {

    public static boolean CheckAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        Map<Character,Integer> frequency=new HashMap<>();
        for(char c:str1.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        for(char c:str2.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c, 0)-1);

            if(frequency.get(c)<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        boolean result=CheckAnagram(str1,str2);
        if(result){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are not anagram");
        }
    }
}
