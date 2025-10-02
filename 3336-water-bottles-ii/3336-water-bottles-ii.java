class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sum=numBottles;
        int e=numBottles;
        int n=numExchange;
        while(e>=n){
            int f=0;
            if(e>=n){
                e=e-n;
                n++;
                f+=1;
            }
            sum+=f;
            e=f+e;
        }
        return sum;
    }
}