class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int digit=0;
        int n=x;
        while(x>0){
            int d=x%10;
            digit=digit*10+d;
            x=x/10;
        }
        return n==digit;
    }
}