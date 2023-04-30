class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while(i<=j){

            if(nums[i]==target){
                return i;
            }else if(nums[j]==target){
                return j;
            }else if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]==target){
                i++;
                j--;
            }
        }
              
        return -1;
    }
}
