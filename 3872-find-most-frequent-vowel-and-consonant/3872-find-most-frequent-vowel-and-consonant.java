class Solution {
    public int maxFreqSum(String s) {
         int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        boolean[] isVowel = new boolean[26];
        for (char v : new char[]{'a', 'e', 'i', 'o', 'u'}) {
            isVowel[v - 'a'] = true;
        }

        int maxVowel = 0;
        int maxConsonant = 0;
        for (int i = 0; i < 26; i++) {
            if (isVowel[i]) {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxConsonant = Math.max(maxConsonant, freq[i]);
            }
        }

        return maxVowel + maxConsonant;
    }
}