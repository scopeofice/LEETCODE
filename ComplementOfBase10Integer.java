class Solution {
    public int bitwiseComplement(int n) {
        int comp = 1;
        int num=0;
        if(n==0) return 1;
        while(n>comp){
        comp=(2*comp)+1;
        num=comp-n;
        }
        return num;
    }
}
