class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr =new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            int next=-1;
            for(int j=nums2.length-1; j>=0 && nums2[j] != nums1[i];j--){
                if(nums2[j] > nums1[i]){
                    next=nums2[j];
                }
            }
            arr[i]=next;
        }
        return arr;
    }
}
