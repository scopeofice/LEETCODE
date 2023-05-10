class Solution {
    public int lengthOfLastWord(String s) {
        String st=s.trim();
        int space=st.lastIndexOf(" ");
        int ans=st.length()-space-1;
        return ans;
    }
}
