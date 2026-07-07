class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        String temp = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (char ch : temp.toCharArray()) {
            if (ch != '0') {
                sb.append(ch);
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
        if (sb.length() == 0) {
            return 0;
        }
        String num = sb.toString();
        res = Long.parseLong(num) * sum;
        return res;
    }
}