class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        
        // i starts at the beginning, j starts at the end
        // The loop runs until the pointers meet in the middle
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            // Swap the characters
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        
        // No return statement needed since the return type is void
    }
}