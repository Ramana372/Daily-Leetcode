class Solution {
    public int longestPalindrome(String s) {
        int[] f=new int[128];
        for(char c: s.toCharArray()){
            f[c]++;
        }
        int l=0;
        boolean odd=false;
        for(int c:f){
        if(c%2==0){
            l+=c;
        }
        else{
            l+=c-1;
            odd=true;
        }
        }
        if(odd)l+=1;
        return l;
    }
}