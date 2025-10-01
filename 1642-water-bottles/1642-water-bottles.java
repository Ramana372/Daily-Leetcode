class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        int e=numBottles;
        while(e>=numExchange){
                int n=e/numExchange;
                sum+=n;
                e=n+(e%numExchange);
        }
        return sum;
    }
}