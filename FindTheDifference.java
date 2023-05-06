class Solution {
    public char findTheDifference(String s, String t) {
        if(t.length()>s.length())
        {
            s=s+" ";
        }
        
        char [] ch1=s.toCharArray();
        char [] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        char result='r';
        for(int i=0;i<t.length();i++)
        {
            if(ch1[i]==ch2[i])
            {
                continue;
            }
            else
            {
                result=ch2[i];
            }
        }
    return result;
    }
}
