class Solution {
    public int reverse(int x) {
        int a=x;
        int digit;
        int rev=0;
        while(a!=0){
            digit=a%10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev=digit+rev*10;
            a/=10;
        }
        return rev;
    }
}