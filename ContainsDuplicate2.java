class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
       for(int i=0;i<nums.length;i++){
           for(int j=1+i;j <= i + k && j < nums.length;j++){
               if(nums[i]==nums[j]){
                   System.gc();
                   return true;
               }
           }
       }
       System.gc();
       return false;
    }
}
