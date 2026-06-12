class Solution {
    public boolean isAnagram(String s, String t) {

        int[] fq = new int[256];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            fq[s.charAt(i)]++; // Incrementing for s
            fq[t.charAt(i)]--; // What should happen here for string t?
        }
        for (int j = 0; j < 256; j++) {
            if (fq[j] != 0) {
                return false;
            }
        }

        return true;

    }
}