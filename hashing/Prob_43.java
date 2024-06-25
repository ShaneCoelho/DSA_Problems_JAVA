//Group anagrams from a list of strings.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        ArrayList<List<String>> result=new ArrayList<>();

        for(String str:strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);
            String word=new String(charArray);

            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }

            map.get(word).add(str);
        }

        result.addAll(map.values());
        return result;
    }
}