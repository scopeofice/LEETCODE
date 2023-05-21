class Solution {
    public boolean isPerfectSquare(int num) {
        int root=(int)Math.pow(num,0.5);
        if(root*root==num){
            return true;
        }
        return false;
    }
}
