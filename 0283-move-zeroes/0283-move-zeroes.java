class Solution {
    public void moveZeroes(int[] nums) {
        // int p=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         int t=nums[p];
        //         nums[p]=nums[i];
        //         nums[i]=t;
        //         p++;
        //     }
        // }

        int id=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[id]=nums[i];
                id++;
            }
        }
        while(id<nums.length){
            nums[id]=0;
            id++;
        }
    }
}