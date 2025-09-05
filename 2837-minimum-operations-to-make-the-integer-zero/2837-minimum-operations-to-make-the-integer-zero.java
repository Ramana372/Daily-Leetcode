class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int k = 1;
        while (k <= 60) {
            long x = (long) num1 - (long) num2 * k;
            if (x >= 0) {
                if (Long.bitCount(x) <= k && k <= x) {
                    return k;
                }
            }
            k++;
        }
        return -1;
    }
}
