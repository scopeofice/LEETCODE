class Solution {
    public boolean isPalindrome(String s) {
        if(s!=null){
            String str=s.toLowerCase();
        String s1=str.replaceAll("[^a-zA-Z0-9]","");
        String rs = "";
for (int i = s1.length() - 1; i >= 0; i--) {
    rs += s1.charAt(i);
}
        if(rs.equals(s1)){
            return true;
        }else{
            return false;
        }
        }
        return true;
    }
}
