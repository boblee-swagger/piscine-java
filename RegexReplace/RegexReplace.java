
// public class RegexReplace {
//    public static String removeUnits(String s) {
//         if (s == null) {
//             return null;
//         }
//         // Matches numbers followed by "cm" or "€" (handles attached and spaced units)
//         return s.replaceAll("(\\d+)(cm|€)(?=\\s|$)", "$1");
//     }   
    
//    public static String obfuscateEmail(String email) {
//     if (email == null || email.isEmpty()) {
//         return email;
//     }

//     String[] parts = email.split("@");
//     if (parts.length != 2) {
//         return email;
//     }

//     String username = parts[0];
//     String domain = parts[1];

//     // Obfuscate username
//     String obfuscatedUsername = obfuscateUsername(username);
    
//     // Obfuscate domain
//     String obfuscatedDomain = obfuscateDomain(domain);

//     return obfuscatedUsername + "@" + obfuscatedDomain;
// }

//     private static String obfuscateUsername(String username) {
//         // If username contains special characters, obfuscate characters next to them
//         if (username.matches(".*[-._].*")) {
//             return username.replaceAll("([^-._])(?=[-._])|(?<=[-._])([^-._])", "*");
//         }
//         // Otherwise obfuscate last 3 characters if length > 3
//         else if (username.length() > 3) {
//             return username.substring(0, username.length() - 3) + "***";
//         }
//         return username;
//     }

//     private static String obfuscateDomain(String domain) {
//         String[] domainParts = domain.split("\\.");
        
//         if (domainParts.length >= 3) {
//             // For domains with 3+ parts (e.g., sub.example.com)
//             // Obfuscate all but first character of first part
//             domainParts[0] = domainParts[0].charAt(0) + 
//                             "*".repeat(domainParts[0].length() - 1);
//             // Obfuscate entire TLD
//             domainParts[domainParts.length - 1] = 
//                             "*".repeat(domainParts[domainParts.length - 1].length());
//         } 
//         else if (domainParts.length == 2) {
//             // For two-part domains (e.g., example.com)
//             // Obfuscate all but first character of first part
//             domainParts[0] = domainParts[0].charAt(0) + 
//                             "*".repeat(domainParts[0].length() - 1);
//             // Only obfuscate TLD if it's not com, org, or net
//             if (!domainParts[1].matches("com|org|net")) {
//                 domainParts[1] = "*".repeat(domainParts[1].length());
//             }
//         }
        
//         return String.join(".", domainParts);
//     }
    
// }


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RegexReplace {
    public static String removeUnits(String s) {
        return s == null ? null : s.replaceAll("(\\d+)(?<!²)(cm|€)(?!²)", "$1");
    }

    public static String obfuscateEmail(String s) {
        if (s == null) {
            return null;
        }
        // create a new stream of data
        List<String> list = new ArrayList<>(Arrays.stream(s.split("@")).toList());

        // get the first item from the list
        String beforeAt = list.get(0);
        StringBuilder obfuscatedName = new StringBuilder();
        String hidden = "";

        // if first part contains _ . or -
        if (beforeAt.contains("_") || beforeAt.contains(".") || beforeAt.contains("-")) {

            // if first part contains _
            if (beforeAt.contains("_")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf("_") + 1));
            }

            // if first part contains -
            if (beforeAt.contains("-")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf("-") + 1));
            }

            // if first part contains .
            if (beforeAt.contains(".")) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.indexOf(".") + 1));
            }
            obfuscatedName.append("*".repeat(beforeAt.length() - obfuscatedName.toString().length()));
        } else if (beforeAt.length() > 3) {
            if (beforeAt.length() == 4) {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.length() - 1)).append("*");
            } else {
                obfuscatedName.append(beforeAt.substring(0, beforeAt.length() - 3)).append("*".repeat(3));
            }

        }

        // append middlepart
        obfuscatedName.append("@");

        // obfuscate või midagi last part
        List<String> otherSideOfAt = new ArrayList<>(Arrays.asList(list.get(1).split("\\.")));
        if (otherSideOfAt.size() == 3) {
            otherSideOfAt.set(0, "*".repeat(otherSideOfAt.get(0).length()));
            otherSideOfAt.set(2, "*".repeat(otherSideOfAt.get(2).length()));
        } else if (otherSideOfAt.size() == 2) {
            otherSideOfAt.set(0, "*".repeat(otherSideOfAt.get(0).length()));
            if (!otherSideOfAt.get(1).matches("^(com|org|net)$")) {
                otherSideOfAt.set(1, "*".repeat(otherSideOfAt.get(1).length()));
            }
        }

        // add first and last part together
        obfuscatedName.append(otherSideOfAt.stream().collect(Collectors.joining(".")));
        return obfuscatedName.toString();
    }
}