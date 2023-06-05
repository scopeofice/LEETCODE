class Solution {
    public int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer> para=new Stack<>();
        para.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                para.push(i);
            }else{
                para.pop();
                if(para.empty()){
                    para.push(i);
                }else{
                    max=Math.max(max,i-para.peek());
                }
            }
        }
        return max;
    }
}
