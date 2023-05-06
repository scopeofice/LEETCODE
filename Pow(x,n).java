class Solution {
    public double myPow(double x, int n) {
       
//         double ans=Math.pow(x,n);
//         return ans;

        if (n == 0) {
            return 1;
        }

        double ans=1.0;
        if(n<0){
            n=n*(-1);
            x=1/x;
        for(int i=0;i<n;i++){
            ans*=x;
        }
        }else{
            for(int j=0;j<n;j++){
                ans*=x;
            }
        }
        return ans;
    }
}
