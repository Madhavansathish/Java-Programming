class Solution {
    public int[] shuffle(int[] nums, int n) {
    int temp=n;
    int j=0;
        int[] nums2=new int[nums.length];
        for(int i=0;i<n;i++){
            nums2[j]=nums[i];
            nums2[j+1]=nums[temp];
            temp++;
            j+=2;
        }
        return nums2;
    }
}
