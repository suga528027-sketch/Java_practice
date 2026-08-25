class Solution {
    public int minSteps(String s, String t) {
        int minimum = 0;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }
        
        for (int i : freq) {
            if (i > 0) {
                minimum += i;
            }
        }
        return minimum;
    }
}