class Solution {
    public int largestAltitude(int[] gain) {
        int start=0;
        int highest=start;
        for(int i=0;i<gain.length;i++){
            start+=gain[i];
            highest=Math.max(highest,start);
        }
        return highest;
    }
}
