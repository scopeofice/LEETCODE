class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         
         int max=Math.max(nums1.length,nums2.length);
         int [] arr=new int[max];
         int k=0;
         for(int i=0;i<nums1.length;i++){
             for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                     arr[k]=nums1[i];
                     k++;
                     nums2[j]=Integer.MIN_VALUE;
                     break;
                 }
                 
             }
             
         }
         return Arrays.copyOfRange(arr,0,k);
}
}
