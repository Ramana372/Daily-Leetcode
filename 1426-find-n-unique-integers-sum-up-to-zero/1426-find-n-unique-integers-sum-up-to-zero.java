class Solution {
    public int[] sumZero(int n) {
        
        int sum=0;
        int[] arr=new int[n];
        for(int i=1;i<=n/2;i++){
            arr[sum++]=i;
            arr[sum++]=-i;
        }

        if(n%2!=0){
            arr[sum]=0;
        }
        return arr;
    }
}