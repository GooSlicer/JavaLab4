package secondTask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static boolean startsWithSameLetter(String name) {
        return name.matches("(?i)([a-z])[a-z]*\\s\\1[a-z]*");
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("(.)", "$1").matches(".+")
                    ? new StringBuilder(words[i]).reverse().toString()
                    : words[i];
        }
        return String.join(" ", words);
    }

    public static String toUpperCaseSnakeCase(String str) {
        return str.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
    }

    public static String toLowerCamelCase(String str) {
        str = str.toLowerCase();
        Pattern p = Pattern.compile("_([a-z])");
        Matcher m = p.matcher(str);
        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }

    public static String[] findNamesStartingAndEndingWithA(String names) {
        String[] nameArray = names.split("\\s+");
        String[] temp = new String[nameArray.length];
        int count = 0;

        Pattern p = Pattern.compile("^A.*A$", Pattern.CASE_INSENSITIVE);
        for (String name : nameArray) {
            if (p.matcher(name).matches()) {
                temp[count++] = name;
            }
        }

        String[] result = new String[count];
        System.arraycopy(temp, 0, result, 0, count);
        return result;
    }

    public static String[] findClosestMatchingPair(String[] strings, String regex) {
        Pattern p = Pattern.compile(regex);
        int lastIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        String[] result = null;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && p.matcher(strings[i]).matches()) {
                if (lastIndex != -1 && (i - lastIndex) < minDistance) {
                    minDistance = i - lastIndex;
                    result = new String[]{strings[lastIndex], strings[i]};
                }
                lastIndex = i;
            }
        }
        return result;
    }
}
