class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int j = 0; j < n; j++) {
            nums1[m] = nums2[j];
            m++;
        }
        int temp=0;
        for (int p=0;p<nums1.length;p++){
            for(int q=p+1;q<nums1.length;q++){
                if(nums1[q]<nums1[p]){
                    temp=nums1[q];
                    nums1[q]=nums1[p];
                    nums1[p]=temp;
                }
            }
        }
        // Arrays.sort(nums1);
    }
}
