package sol;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexMatcher {

    public RegexMatcher() {}

    public static String regexifier(String input, String regex) {

        String returnString = new String();
        if (input == null || regex == null) {
            return returnString;
        }

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        while(m.find()) {
            returnString = returnString + m.group() + " ";
        }

        return returnString.trim();
    }

    public static String brownEmails(String input) {
        String emails = new String();

        emails = regexifier(input, "[A-z-_]+[A-z_-]+([0-9]+)*(@brown.edu)");
        return emails;
    }
}
