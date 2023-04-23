class Solution {
    public int reverse(int x) {
        int rem;
        long rev=0;
        int temp=x;
        if(x<0){
            x=x*(-1);
        }
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temp<0){
            rev=rev*(-1);
        }
        return (int)rev;
    }
}
