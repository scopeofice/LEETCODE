class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=1;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int min=1;
        int k=Integer.MAX_VALUE;
        while(min<=max){
            int mid=(min+max)/2;
            int time=0;
            for(int j=0;j<piles.length;j++){
                 time += Math.ceil((double) piles[j] / mid);
            }
            if(time<=h){
                k=Math.min(k,mid);
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return k;
    }
}
