class Solution {
    public int hIndex(int[] citations) {

        // int start=0;
        // int end=citations.length;
        // int mid=(end-start)/2;
        // return mid+1;

        // int mid=citations.length/2;
        // return citations[mid];


        int index=0;
        int count=0;
        int n= citations.length;
        for(int i=0;i<n;i++){
            count=n-i;
            if(citations[i]>=count){
                index=Math.max(index,count);
            }
        }
        return index;
    }
}
