class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1 || num==0){
            return true;
        }
        long start=1;
        long end= num/2;
        while (start<=end){
            long mid=(start+(end-start)/2);
            // long root=num/mid;
            if(mid*mid==num){
                return true;
            }else if((mid*mid)<num){
                // end=mid-1;
                start=mid+1;
            }else{
                // start=mid+1;
                end=mid-1;
            }
        }
        // int root=(int)Math.pow(num,0.5);
        // if(root*root==num){
        //     return true;
        // }
        // return false;
        return false;
    }
}
