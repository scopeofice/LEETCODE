class Solution {
    public boolean buddyStrings(String s, String goal) {
      
        if (s.length() != goal.length()) {
            return false;
        }

       if(s.equals(goal)){
           Set<Character> set=new HashSet<>();
           for(char c: s.toCharArray()){
               set.add(c);
           }
           return set.size()<goal.length();
       }
       int i=0;
       int j=s.length()-1;
       while(i<j && s.charAt(i)==goal.charAt(i)){
           i++;
       }
       while(j>=0 && s.charAt(j)==goal.charAt(j)){
           j--;
       }
       if(i<j){
           char [] ch1=s.toCharArray();
           char temp=ch1[i];
           ch1[i]=ch1[j];
           ch1[j]=temp;
           s=new String (ch1);
       }
       return s.equals(goal);
    }
}


//  StringBuilder sb=new StringBuilder();
//         for(int i=s.length()-1;i>=0;i--){
//             char ch=s.charAt(i);
//             sb.append(ch);
//         }
//         String str=new String(sb);
//         if(str.equals(goal)){
//             return true;
//         }
//         return false;


// if(s.length()!=goal.length() || s.length()<=1){return false;}
//        if(s.equlas(goal)){
//            HashMap<Character,Integer> map=new HashMap<>();
//            for(char ch:s.toCharArray()){
//                map.put(ch,map.getOrDefault(ch,0)+1);
//            }
//            for(char ch:map.keySet()){
//                if(map.get(ch)>1){}
//            }
//        }
