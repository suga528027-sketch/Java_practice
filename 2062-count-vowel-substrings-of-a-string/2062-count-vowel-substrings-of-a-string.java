class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            boolean a = false, e = false, in = false, o = false, u = false;
            for (int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (ch == 'a') a = true;
                else if (ch == 'e') e = true;
                else if (ch == 'i') in = true;
                else if (ch == 'o') o = true;
                else if (ch == 'u') u = true;
                else break;
                if (a && e && in && o && u) {
                    count++;
                }
            }
        }
        return count;
    }
}