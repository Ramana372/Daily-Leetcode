class Solution {
    public int maxProfit(int[] prices) {
        int m=Integer.MAX_VALUE;
        int mp=0;
        for(int p:prices){
            if(p<m){
                m=p;
            }
            else if(p-m>=mp){
                mp=p-m;
            }
        }
        return mp;
    }
}