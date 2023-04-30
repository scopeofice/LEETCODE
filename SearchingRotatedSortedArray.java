class Solution {
    public int search(int[] nums, int target) {
        
        
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
          
            if(nums[mid] == target) return mid;
            
            if(nums[mid] >= nums[start]){
                if(target >= nums[start] && target <= nums[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else{ 
                if(target >= nums[mid] && target <= nums[end]){
                    start = mid + 1;
                } else{
                    
                    end = mid - 1;
                }
            }
        }

        return -1;
        
        
//         int i = 0;
//         int j = nums.length - 1;
//         while(i<=j){

//             if(nums[i]==target){
//                 return i;
//             }else if(nums[j]==target){
//                 return j;
//             }else if(nums[i]+nums[j]>target){
//                 j--;
//             }else if(nums[i]+nums[j]<target){
//                 i++;
//             }else if(nums[i]+nums[j]==target){
//                 i++;
//                 j--;
//             }
//         }
              
//         return -1;
    }
}
