class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false; 
        }
        
        if (s.equals(goal)) {
            return true;
        }
        
        String concatenated = s + s;
        return concatenated.contains(goal);
        
        // char [] ch=s.toCharArray();
        // StringBuilder sb=new StringBuilder();
        // int start=0;
        // int end=ch.length-1;
        // boolean exit=false;
        // while(!exit){
        //     if(!s.equals(goal)){
        //         while (start < end) {
        //     char temp = ch[start];
        //     ch[start] = ch[end];
        //     ch[end] = temp;
        //     start++;
        //     end--;
        //  }
                  
        //         }
        //         else{
        //               exit=false;
        //               return true;

        //           }
        //     } 
        //     return false;
        }
    }
