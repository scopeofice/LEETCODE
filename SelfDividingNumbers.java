class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isDividing(int n) {
        int num = n;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            if (rem == 0 || num % rem > 0) {
                return false;
            }
        }
        return true;
    }
}
