class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int j=0;j<s.length();j++){
            if(map.get(s.charAt(j))==1){
                return j;
            }
            
        }
        return -1;
    }
}


        // char[] arr=s.toCharArray();
        // Arrays.sort(arr);
        // int flag=0;
        // int count=0;
        // for(int 1=0;i<arr.length;i++){

        // }
        // // int j=arr.length-1;
        // // int count=0;
        // // for(int i=0;i<arr.length;i++){
        // //     count=0;
        // //     for(int j=i+1;j<arr.length-1;j++){
        // //         if(arr[i]!=arr[j]){
        // //             count++;
        // //         }
        // //     }

        //     // if(arr[i]!=arr[j]){
        //     //     count++;
        //     //     j--;
        //     // }
        // }
        // return count;
//     }
// }
