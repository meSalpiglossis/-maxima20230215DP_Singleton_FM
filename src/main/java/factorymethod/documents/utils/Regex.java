package factorymethod.documents.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static String last9Symbols (String string) {
        String regex = ".{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            string = matcher.group(0);
        }
        return string;
    }
}
