class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int total=0;
        for(int i=0;i<n;i++){
            total=total+nums[i];
        }
        return sum-total;
    
    }
}
// class Solution {
//     public int missingNumber(int[] nums) {
//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//             ans+=((i+1)-nums[i]);
//         }   
//         return ans;
//     }
// }

