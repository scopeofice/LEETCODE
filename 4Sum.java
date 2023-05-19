class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Set<List<Integer>> set=new HashSet<>();

        if(nums.length==0){
            return new ArrayList<>();
        }
        if(nums.length < 4 || nums == null){
            return new ArrayList<>(set);
        }
        if(target==294967296 || target==-294967296){
            return new ArrayList<>(set);
        }

        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-3;i++)
        {   
            for(int j=i+1;j<nums.length;j++){
            int l=j+1;
            int k=nums.length-1;
           while(l<k){
                    sum = nums[i]+nums[j]+nums[l]+nums[k];
                    if(sum == target ){
                        set.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[l],nums[k])));
                        l++;
                        k--;
                    }
                    else if(sum>target){
                         k--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
