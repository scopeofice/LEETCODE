class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer> n1=new HashSet<>();
        Set<Integer> n2=new HashSet<>();
        int min=10;
        for(int i : nums1){ n1.add(i);}
        for(int j : nums2){ n2.add(j);}
        for(int k : n1){
            if(n2.contains(k))
            min=Math.min(min,k);
        }
        if(min!=10){
            return min;
        }
//         int min = 10;
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j] && nums1[i] < min) {
//                     min = nums1[i];
//                 }
//             }
//         }
//         if(min != 10){
//         return min;
// 	    }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a=Math.min(nums1[0],nums2[0]);
        int b=Math.max(nums1[0],nums2[0]);
        if(a==b){
            return a;
        }
        return a*10+b;
    }
}
