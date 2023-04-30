class Solution {
    public int mySqrt(int x) {
        int a=0;
        int b=x;
        int mid;
        if((x==0)||(x==1)){
            return x;
        }
        while(a<=b){ 
            mid=a+(b-a)/2;
            if(mid==x/mid) return mid;
            if(mid>x/mid) b=mid-1; else a=mid+1;
        }
        return b;
    }
}
