public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true; // Empty string or null is considered a palindrome
        }
        
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Clean string by removing non-alphanumeric chars and lowercase.
        int left = 0;
        int right = cleanS.length() - 1;

        while (left < right) {
            if (cleanS.charAt(left) != cleanS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

   
}
   