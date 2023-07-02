class Solution {
    public int trap(int[] height) {


        int left=0;
        int right=height.length-1;
        int max=0;
        int min=0;
        int water=0;
        while(left<right){
            max=Math.max(max,height[left]);
            min=Math.max(min,height[right]);
            water+=(max<min)?max-height[left++]:min-height[right--];
        }
        return water;

        // int res=0;
        // for(int i=0;i<height.length;i++){
        //     int left=0;
        //     for(int j=0;j<=i;j++){
        //         left=Math.max(left,height[j]);
        //     }
        //     int right=Integer.MIN_VALUE;
        //     for(int j=i;j<=height.length-1;j++){
        //         right=Math.max(right,height[j]);
        //     }
        //     res+=Math.min(left,right)-height[i];
        // }
        // return res;
    }
}
