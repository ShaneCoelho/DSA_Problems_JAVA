//Longest Substring Without Repeating Characters.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int start=0;
        int maxLength=0;

        for(int end=0;end<s.length();end++){
            char currChar=s.charAt(end);

            if(map.containsKey(currChar) && map.get(currChar)>=0){
                start=Math.max(map.get(currChar)+1,start);
            }

            map.put(currChar,end);

            maxLength=Math.max(maxLength,end-start+1);
        }

        return maxLength;
    }
}

// Using other logic

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int maxlength=0;
        HashMap<Character,Integer> map=new HashMap<>();

        while(r<n){

            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))>=l){
                    l=map.get(s.charAt(r))+1;
                }
            }    
            map.put(s.charAt(r),r);
            maxlength=Math.max(maxlength,r-l+1);
            r++;

        }

        return maxlength;
    }
}