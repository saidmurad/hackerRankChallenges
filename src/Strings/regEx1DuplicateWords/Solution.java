package Strings.regEx1DuplicateWords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String input = "This is is a test test sentence with repeated repeated words words.";
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        // Replace repeated words with a single instance
        String result = matcher.replaceAll("$1");

        System.out.println(result);

    }
}
