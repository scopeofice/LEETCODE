class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        boolean negative = false;
        int result = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                negative = true;
            }
            i++;
        }
    
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - 48;
            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                if (negative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
            result = result * 10 + digit;
            i++;
        }
        if (negative) {
            result = -result;
        }
        return result;
    }
}
