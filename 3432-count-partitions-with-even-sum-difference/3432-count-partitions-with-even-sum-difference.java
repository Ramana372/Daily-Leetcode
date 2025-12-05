class Solution {
    public int countPartitions(int[] nums) {
       int n = nums.length;
        if (n < 2) return 0;
        
        long total = 0;
        for (int x : nums) {
            total += x;
        }
        if ((total & 1) == 1) {
            return 0;
        }
        return n - 1;
    }
}