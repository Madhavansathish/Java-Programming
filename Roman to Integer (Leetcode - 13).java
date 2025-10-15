class Solution {
    public int roman(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int curr=roman(s.charAt(i));
            int next=(i+1 < s.length())? roman(s.charAt(i+1)):0;
            if(curr<next){
                sum=sum-curr;
            }
            else{
                sum=sum+curr;
            }
        }
        return sum;
    }
}
