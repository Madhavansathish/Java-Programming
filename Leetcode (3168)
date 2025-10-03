class Solution {
    public int minimumChairs(String s) {
        int free=0;
        int min=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E')
               free++;
            else if(s.charAt(i)=='L')
               free--;
            if(free>min)
               min=free;
        }
        return min;
    }
}
