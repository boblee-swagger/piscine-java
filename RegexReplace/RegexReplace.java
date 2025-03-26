import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexReplace {
   public static String removeUnits(String s) {
        if (s == null) {
            return null;
        }
        // Matches numbers followed by "cm" or "€" (handles attached and spaced units)
        return s.replaceAll("(\\d+)\\s*(cm|€)(?=\\s|$)", "$1");
    }   
    
    public static String obfuscateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return email;
        }
        
        // Regex to split email into username and domain
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher(email);
        
        if (!emailMatcher.find()) return email;
        
        String username = emailMatcher.group(1);
        String domain = emailMatcher.group(2);
        
        // Obfuscate username
        String obfuscatedUsername = obfuscateUsername(username);
        
        // Obfuscate domain
        String obfuscatedDomain = obfuscateDomain(domain);
        
        return obfuscatedUsername + "@" + obfuscatedDomain;
    }
    
    private static String obfuscateUsername(String username) {
        // Check for characters next to special characters
        Pattern specialCharsPattern = Pattern.compile("([-._])([^-._])");
        Matcher specialCharsMatcher = specialCharsPattern.matcher(username);
        
        if (specialCharsMatcher.find()) {
            return username.replaceAll("([-._])([^-._])", "$1*");
        }
        
        // If length > 3, hide last 3 characters
        if (username.length() > 3) {
            return username.substring(0, username.length() - 3) + "***";
        }
        
        return username;
    }
    
    private static String obfuscateDomain(String domain) {
        // Split domain parts
        String[] domainParts = domain.split("\\.");
        
        if (domainParts.length >= 3) {
            // Three-part domain or more: hide third-level and top-level domains
            StringBuilder result = new StringBuilder();
            // Handle third-level domain
            result.append(domainParts[0].charAt(0))
                  .append("*".repeat(domainParts[0].length() - 1))
                  .append(".");
            // Keep second-level domain as is
            result.append(domainParts[1])
                  .append(".");
            // Hide top-level domain
            result.append("*".repeat(domainParts[2].length()));
            
            // Handle any additional subdomains (hidden)
            for (int i = 3; i < domainParts.length; i++) {
                result.append(".").append("*".repeat(domainParts[i].length()));
            }
            return result.toString();
        } else if (domainParts.length == 2) {
            // Two-part domain
            String secondLevel = domainParts[0];
            String topLevel = domainParts[1];
            
            // Preserve .com, .org, .net top-level domains
            if (topLevel.matches("com|org|net")) {
                return secondLevel.charAt(0) + 
                       "*".repeat(secondLevel.length() - 1) + 
                       "." + topLevel;
            } else {
                // Hide both parts for other TLDs
                return secondLevel.charAt(0) + 
                       "*".repeat(secondLevel.length() - 1) + 
                       ".*";
            }
        }
        
        return domain; // fallback for unexpected formats
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println(RegexReplace.removeUnits("32cm et 50€"));
        System.out.println(RegexReplace.removeUnits("32 cm et 50 €"));
        System.out.println(RegexReplace.removeUnits("32cms et 50€!"));
        
        System.out.println(RegexReplace.obfuscateEmail("john.doe@example.com"));
        System.out.println(RegexReplace.obfuscateEmail("jann@example.co.org"));
        System.out.println(RegexReplace.obfuscateEmail("jackob@example.fr"));
    
    }
}