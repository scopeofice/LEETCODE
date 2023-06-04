class Solution {
    public int[] singleNumber(int[] nums) {
        int [] arr = new int[2];
        int index=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        Set<Integer> set=new HashSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(map.get(i)==1){
                arr[index]=i;
                index++;
            }if(index==2){
                return arr;
            }
        }
        return arr;
    }
}
