class Solution {
    public boolean isFascinating(int n) {
        String str=(n)+""+(n*2)+""+(n*3);
        if(str.contains("0")){
            return false;
        }
        if(str.length()>9){
            return false;
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            set.add(c);
        }
        if(set.size()==9){
            return true;
        }
        return false;
    }
}
