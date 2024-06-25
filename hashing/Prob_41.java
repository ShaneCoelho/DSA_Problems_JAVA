//Find the first non-repeating character in a string.

class Solution
{
    
    public String FirstNonRepeating(String A)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        StringBuilder ans = new StringBuilder(); //Used this because it takes less time complexity
        
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            queue.add(ch);
            
            while(!queue.isEmpty()){
                if(map.get(queue.peek())>1){
                    queue.poll();
                }else{
                    ans.append(queue.peek());
                    break;
                }
            }
            
            if(queue.isEmpty()){
                ans.append("#");
            }
        }
        
        return ans.toString();
    }
}