class Solution {
    public int maxSubArray(int[] nums) {
        int total=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],nums[i]+max);
            total=Math.max(max,total);
        }
        return total;
    }
}
