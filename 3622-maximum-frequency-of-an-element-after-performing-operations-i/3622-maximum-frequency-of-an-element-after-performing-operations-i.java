class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
    //     Arrays.sort(nums);
    //     int n=nums.length;
    //     int mf=1;
    //     for(int t=0;t<n;t++){
    //         int f=1;
    //         int r=numOperations;
    //         for(int i=t-1;i>=0 && r>0;i--){
    //             int d=nums[t]-nums[i];
    //             if(d<=k){
    //                 f++;
    //                 r--;
    //             }
    //             else{
    //                 break;
    //             }
    //         }
    //     mf = Math.max(mf, f);
    // }
    // return mf;


    int mx=nums[0];
    for(int n:nums){
        if(n>mx){
            mx=n;
        }
    }
    mx+=k;


    int[] f=new int[mx+1];
    for(int n:nums){
        f[n]++;
    }

    for(int i=1;i<=mx;i++){
        f[i]+=f[i-1];
    }

    int res=0;

    for(int t=0;t<=mx;t++){
        if(f[t]==0){
            continue;
        }

        int l=Math.max(0, t-k);
        int r=Math.min(mx,t+k);

        int tc=f[r]-(l>0 ? f[l-1]:0);
        int fc=f[t]-(t>0?f[t-1]:0);
        int nc=tc-fc;
        int mc=fc+Math.min(nc,numOperations);

        res=Math.max(res, mc);
    }
    return res;
    }
}