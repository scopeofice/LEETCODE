class Solution {
    public int countAsterisks(String s) {
        char[] ch = s.toCharArray();
        int count = 0;
        int c=0;
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '|') {
                count++;
            }
            if(ch[i]=='*' && count%2==0){
                c++;
            }
        }
        return c;
    }
}
