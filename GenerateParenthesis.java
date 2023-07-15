class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(list,"",n,n);
        return list;
    }
    public void helper(List<String> list,String str,int left,int right){
        if(left==0 && right==0){
            list.add(str);
        }
        if(left>0){
            helper(list, str+"(",left-1,right);
        }
        if(right>left){
            helper(list,str+")",left,right-1);
        }
    }
}





// List<String> list=new ArrayList<>();
//         if(n==0) return list;
//         for (int leftCount = 0; leftCount < n; leftCount++) {
//     List<String> leftStrings = generateParenthesis(leftCount);
//     for (int i = 0; i < leftStrings.size(); i++) {
//         String leftString = leftStrings.get(i);
//         List<String> rightStrings = generateParenthesis(n - 1 - leftCount);
//         for (int j = 0; j < rightStrings.size(); j++) {
//             String rightString = rightStrings.get(j);
//             answer.add("(" + leftString + ")" + rightString);
//         }
//     }
// }
