class Solution {
    public int minimizedStringLength(String s) {
        char [] arr=s.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}
