
0/5
class Solution {
    public int threeSumClosest(int[] nums, int target) {
    
             int ans = 0;
        int diff = Integer.MAX_VALUE;
        int len = nums.length;
        Arrays.sort(nums);
		
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            int k = len - 1;
			
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(diff) >= Math.abs(sum - target)) {
                    diff = sum - target;
                    ans = sum;
                }
                
                if (sum > target) {
                    k--;
                }
                else {
                    j++;
                }
            }
        }
        return ans;
      }
    }
