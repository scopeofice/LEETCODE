class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int ans=nums.length+1,j=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target){
                while(sum>=target){
                    sum-=nums[j++];
                }
                ans=Math.min(ans,i-j+2);
            }
        }
        return ans==nums.length+1 ? 0 : ans;

        // int start=0;
        // int end=0;
        // int sum=0;
        // int res=Integer.MAX_VALUE;
        // for(end=0;end<nums.length;end++){
        //     sum+=nums[end];
        //     while(sum>=target){
        //         res=Math.min(res,end-start+1);
        //         sum-=nums[start++];
        //     }
        // }
        // return res==Integer.MAX_VALUE?0:res;
    }
}
