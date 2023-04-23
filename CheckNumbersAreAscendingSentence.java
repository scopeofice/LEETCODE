class Solution {
    public boolean areNumbersAscending(String s) {
    
    int n = s.length();
    int last = 0;
    int i = 0;
    while (i < n) {
        while (i < n && !Character.isDigit(s.charAt(i))) {
            i++;
        }
        if (i == n) {
            break;
        }
        int j = i;
        int num = 0;
        while (j < n && Character.isDigit(s.charAt(j))) {
            num = num * 10 + (s.charAt(j) - '0');
            j++;
        }
        if (last != 0 && num <= last) {
            return false;
        }
        last = num;
        i = j;
    }
    return true;
    
    }
}
