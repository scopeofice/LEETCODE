class Solution {
    private int[] arr;
    private int[] orignal;

    Random rand=new Random();
    private int randRange(int min, int max){
        return rand.nextInt(max-min)+min;
    }
    private void swapAt(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public Solution(int[] nums) {
        arr=nums;
        orignal=nums.clone();
    }
    
    public int[] reset() {
        arr=orignal;
        orignal=orignal.clone();
        return orignal;
    }
    
    public int[] shuffle() {
        for(int i=0;i<arr.length;i++){
            swapAt(i,randRange(i,arr.length));
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
