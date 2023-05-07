class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0;
        int index=0;
        int n=citations.length;
        for(int i=0;i<n;i++){
            count=n-i;
            if(citations[i]>=count){
                index=Math.max(index,count);
            }
        }
            return index;
    }
}
