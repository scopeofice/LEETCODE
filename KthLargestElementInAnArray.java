class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }
    
    public void quickSort(int arr[],int left,int right){
        if(left<right){
            int pivot=partition(arr,left,right);
            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }
    public int partition(int arr[],int low,int high){
        int i=low;
        int j=low;
        int piot=high;
        while(i<=high){
            if(arr[i]<=arr[high]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
}

