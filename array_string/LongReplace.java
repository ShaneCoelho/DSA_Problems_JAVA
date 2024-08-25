/*longest repeating character replacement */

class LongReplace {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxfreq=0;
        int[] freq=new int[26];

        while(r<s.length()){
            int i=s.charAt(r)-'A';
            freq[i]++;
            maxfreq=Math.max(maxfreq,freq[i]);

            if((r-l+1)-maxfreq<=k){
                maxlen=Math.max(maxlen,r-l+1);
            }else{
                int a=s.charAt(l)-'A';
                l++;
                freq[a]--;
            }
            r++;
        }

        return maxlen;
    }
}