class Solution {
    public String intToRoman(int num) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] set = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    
    String empty = "";
    
    for (int i = 0; i < set.length; i++) {
        while (num >= set[i]) {
            num -= set[i];
            empty += roman[i];
        }
    }
    
    return empty;

    }
}
