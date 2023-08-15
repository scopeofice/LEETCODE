class Solution {
    public int longestSubstring(String s, int k) {
        int [] arr=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            Arrays.fill(arr,0);
            int unique=0;
            int count=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                arr[ch-'a']++;
                if(arr[ch-'a']==1){unique++;}
                if(arr[ch-'a']==k){count++;}
                if(count>=unique){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}
