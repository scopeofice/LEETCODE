class Solution {
    public String largestNumber(int[] nums) {
        String [] str=new String [nums.length];
        
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }

        Arrays.sort(str, new Comparator<String>(){
            @Override
            public int compare(String a,String b){
                String fir=a+b;
                String sec=b+a;
            return sec.compareTo(fir);
            }
            });
            if(str[0].equals("0")){
            return "0";
            }
            StringBuilder sb=new StringBuilder();
            for(String s:str){
            sb.append(s);
        }
        return sb.toString();
    }
}
