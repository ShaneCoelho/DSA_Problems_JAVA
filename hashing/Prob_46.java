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