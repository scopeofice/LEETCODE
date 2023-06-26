class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> str=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(!str.isEmpty() && str.peek()==arr[i]){
                str.pop();
            }else{
                str.push(arr[i]);
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!str.isEmpty()){
            sb.append(str.pop());

        }

        return sb.reverse().toString();

        // Map<Character,Integer> map=new HashMap<>();
        // StringBuilder result = new StringBuilder();

        // for (char c : arr) {
        //     if (!map.containsKey(c)) {
        //         map.put(c, 1);
        //         result.append(c);
        //     }else{
        //         map.remove(c);
        //     }
        // }

        // return result.toString();
    }
}
