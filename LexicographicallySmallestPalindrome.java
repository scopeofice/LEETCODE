class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(ch[i]==ch[j]){
                i++;
                j--;
            }else if(ch[i]<ch[j]){
                ch[j]=ch[i];
                i++;
                j--;
            }else{
                ch[i]=ch[j];
                i++;
                j--;
            }
        }
        String str=new String(ch);
        return str;
    }
}
