public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        String cleanS = s.toLowerCase(); 
        int left = 0;
        int right = cleanS.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(cleanS.charAt(left)) && !Character.isWhitespace(cleanS.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(cleanS.charAt(right)) && !Character.isWhitespace(cleanS.charAt(right))) {
                right--;
            }

            if (cleanS.charAt(left) != cleanS.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
   
}
   