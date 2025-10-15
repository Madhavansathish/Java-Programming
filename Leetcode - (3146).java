class Solution {
    public int findPermutationDifference(String s, String t) {
        int i=0;
        int j=0;
        int diff=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
              diff+=Math.abs(i-j);
              i++;
              j=0;
            }
            else{
                j++;
            }
        }
        return diff;
    }
}
