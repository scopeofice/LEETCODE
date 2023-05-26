class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();


        // int j=s.length()-1;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i)==' '){
        //         String str = s.substring(i+1,j+1);
        //         sb.append(str).append(' ');
        //         j=i-1;
        //     }
        // }
        // sb.append(s.substring(0,j+1));
        // return sb.toString().trim();
    }
}
