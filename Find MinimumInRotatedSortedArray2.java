class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<end){
        mid=start+(end-start)/2;
        if(nums[mid]>nums[end]){
            start=mid+1;
        }else if(nums[mid]<nums[start]){
            end=mid;
            start++;
        }else
            end--;
        }
        return nums[start];
    }
}