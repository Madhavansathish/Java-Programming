class Solution {
    public int longestBalanced(String s) {
       
        int n=s.length();
        int maxlen=0;
        

        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            
            for(int j=i;j<n;j++){

                char ch=s.charAt(j);
                int idx=ch-'a';

                freq[idx]++;

                if(isbalanced(freq)){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }

    public boolean isbalanced(int[] freq){
        int val=-1;
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                if(val==-1){
                    val=freq[i];
                }
                else if(freq[i]!=val){
                    return false;
                }
            }
        }
        return true;
    }
}
