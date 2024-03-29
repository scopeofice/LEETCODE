class Solution {
    public int findKthLargest(int[] nums, int k) {
        // quickSort(nums,0,nums.length-1);
        // return nums[nums.length-k];
        mergSort(nums,0,nums.length-1);
        return nums[nums.length-k];
    }
    
    // public void quickSort(int arr[],int left,int right){
    //     if(left<right){
    //         int pivot=partition(arr,left,right);
    //         quickSort(arr,left,pivot-1);
    //         quickSort(arr,pivot+1,right);
    //     }
    // }
    // public int partition(int arr[],int low,int high){
    //     int i=low;
    //     int j=low;
    //     int piot=high;
    //     while(i<=high){
    //         if(arr[i]<=arr[high]){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //             j++;
    //         }
    //         i++;
    //     }
    //     return j-1;
    // }

    public void mergSort(int [] arr,int left,int right){
        if(left>=right){ return;}

            int mid=(left+right)/2;
            mergSort(arr,left,mid);
            mergSort(arr,mid+1,right);
            merg(arr,left,mid,mid+1,right);

    }
    public void merg(int []arr,int leftStart,int leftEnd,int rightStart,int rightEnd){
        int len=rightEnd-leftStart+1;
        int []temp=new int[len];
        int pos=-1;

        while((leftStart<=leftEnd) && (rightStart<=rightEnd)){
            if(arr[leftStart]<arr[rightStart]){
                temp[++pos]=arr[leftStart];
                leftStart++;
            }
            else{
                temp[++pos]=arr[rightStart];
                rightStart++;
            }
        }
        while(leftStart<=leftEnd){
            temp[++pos]=arr[leftStart];
            leftStart++;
        }
        while(rightStart<=rightEnd){
            temp[++pos]=arr[rightStart];
            rightStart++;
        }

        for(int k=1;k<=len;k++){
            arr[rightEnd--]=temp[pos--];
        }
    }
}
