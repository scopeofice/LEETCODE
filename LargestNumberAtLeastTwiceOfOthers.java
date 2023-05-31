import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int dominantIndex(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Convert the set to an array for sorting
        Integer[] sortedArr = set.toArray(new Integer[0]);
        Arrays.sort(sortedArr);
        
        // Check if the largest element is at least twice the second largest
        if (sortedArr.length > 1 && sortedArr[sortedArr.length - 1] >= 2 * sortedArr[sortedArr.length - 2]) {
            int max = sortedArr[sortedArr.length - 1];
            
            // Find the index of the maximum value in the original array
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == max) {
                    return i;
                }
            }
        }
        
        return -1;
    }
}



// class Solution {
//     public int dominantIndex(int[] nums) {
//         int [] arr=nums;
//         HashSet <Integer> set=new HashSet <> ();
//         for(int i=0;i<nums.length;i++){
//             set.add(arr[i]);
//         }
//         Collections.sort(set);
//         if(set[set.length-1]/2==set[set.length-2]){
//             int max=set.length-1;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==max){
//                 return i;
//             }
//         }
        
//         return -1;
//     }
// }
