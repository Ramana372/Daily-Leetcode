class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int c=0;
        for(int n:nums){
            c+=n;
            m=Math.max(c,m);
            if(c<0){
                c=0;
            }
        }
        return m;
    }
}