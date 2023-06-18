class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;


        // int i=1;
        // int temp=0;
        // int res=0;
        // int ans=num;
        // while(i<=num){
        //     res=num%i;
        //     if(res==0){
        //         temp+=i;
        //     }
        //     i++;
        // }
        // if(temp==ans){
        //     return true;
        // }
        // return false;
    }
}
