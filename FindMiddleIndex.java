class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int left=0,rigth=0;
        for(int num:nums){
            rigth+=num;
        }
        for(int i=0;i<nums.length;i++){
            rigth-=nums[i];
            if(left==rigth){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
