class Solution {
    public int[] twoSum(int[] arr, int target) {

			for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[j]==target-arr[i]) {
				return new int[]{j,i};
    }
}
			}
			return null;
		}
}
