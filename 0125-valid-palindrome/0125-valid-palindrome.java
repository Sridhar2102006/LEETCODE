class Solution {
    public boolean isPalindrome(String s) {
        // Clean the string first
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Use the length of the CLEANED string
        int n = cleaned.length(); 
        
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            // Corrected the typos and added 'cleaned.' reference
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false; 
            }
        }
        return true;
    }
}