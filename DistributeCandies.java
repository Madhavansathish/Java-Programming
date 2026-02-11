class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int n:candyType){
            set.add(n);
        }
        int n=candyType.length;
        if(n/2 < set.size()){
            return n/2;
        }
        return set.size();
        
    }
}
