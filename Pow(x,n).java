class Solution {
    public double myPow(double x, int n) {
       
        long N = n;
        
        if (N == 0) {
            return 1;
        } else if (N < 0) {
            return 1 / power(x, -N);
        } else {
            return power(x, N);
        }
    }
    
    private double power(double x, long n) {
        if (n == 0) {
            return 1;
        }
        
        double result = power(x, n / 2);
        result *= result;
        
        if (n % 2 == 1) {
            result *= x;
        }
        
        return result;


    //    if (n == 0) {
    //         return 1;
    //     }
    //     if(n<0){
    //         return 1 / myPow(x, -n);
    //     }
    //     double result = myPow(x,n/2);
    //     result *= result;
        
    //     if (n % 2 == 1) {
    //         result *= x;
    //     }
        
    //     return result;

        // double ans=Math.pow(x,n);
        // return ans;

        // if (n == 0) {
        //     return 1;
        // }

        // double ans=1.0;
        // if(n<0){
        //     n=n*(-1);
        //     x=1/x;
        // for(int i=0;i<n;i++){
        //     ans*=x;
        // }
        // }else{
        //     for(int j=0;j<n;j++){
        //         ans*=x;
        //     }
        // }
        // return ans;
    }
}
