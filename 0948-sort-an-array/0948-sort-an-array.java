class Solution {
    public int[] sortArray(int[] nums) {
       int min=nums[0],max=nums[0];
       for(int num:nums){
        if(num<min) min=num;
        if(num>max) max=num;
       }
       int r=max-min+1;
       int[] a=new int[r];
       for(int num:nums){
        a[num-min]++;
       }

        int index = 0;
        for (int i = 0; i < r; i++) {
            while (a[i] > 0) {
                nums[index++] = i + min;
                a[i]--;
            }
        }
        
        return nums;
    }
}