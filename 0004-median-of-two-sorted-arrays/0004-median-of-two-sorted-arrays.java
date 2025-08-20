class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merg= new int[n+m];
        for(int i=0;i<n;i++){
            merg[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merg[n+i]=nums2[i];
        }
        Arrays.sort(merg);

        if(merg.length%2==0){
            return (merg[(merg.length/2)-1]+merg[merg.length/2])/2.0;
        }
        else{
        return merg[merg.length/2];
        }
    }
}