class Solution {
    public int pivotIndex(int[] nums) {
     int sum=0;
     int left=0;
     for(int i=0;i<nums.length;i++){
         sum+=nums[i];
     } 

     for(int j=0;j<nums.length;j++){
         if(left == sum-left-nums[j]){
             return j;
         }
         left+=nums[j];
     }
     return -1;
    }
}