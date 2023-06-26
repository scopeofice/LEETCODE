class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j=1;
        while(j<=nums.length){
            if(set.contains(j)){
                j++;
            }
            else{
                return j;
            }
        }
        return nums.length+1;
    }
}
