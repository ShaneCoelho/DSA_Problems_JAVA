//Longest Consecutive Sequence

class LongConsecSeq {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int len=1;
        if(n==0){
            return 0;
        }

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                len=Math.max(len,cnt);
            }

        }

        return len;
    }
}