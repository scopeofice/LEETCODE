class Solution {
    public int removeDuplicates(int[] nums) {
       int count = 0;
    for (int i = 0; i < nums.length; i++) {
        if (count < 2 || nums[i] > nums[count - 2]) {
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
       
       
       
        // int k=2;
        // for(int i=1;i<nums.length;i++){

        //     if(nums[k-2]!=nums[i]){

        //         nums[k]=nums[i];
                
        //         k++;
        //     }
            
        // }
        // return k;
    }
}
