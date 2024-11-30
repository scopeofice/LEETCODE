class Solution {
    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;
        Integer[] counts = new Integer[n];
        List<Integer> arr = new ArrayList<>();
        
        for (int i = n - 1; i >= 0; i--) {
            int num = nums[i];
            int index = Index(arr, num);
            arr.add(index, num);
            counts[i] = index;
        }
        
        return Arrays.asList(counts);
    }
    
    private int Index(List<Integer> arr, int target) {
        int left = 0, right = arr.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
