package ru.mirea.task24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPHelper {
    private static final String kIpAddressRegex =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    private static Pattern pattern;

    static {
        pattern = Pattern.compile(kIpAddressRegex);
    }


    public static boolean isValid(String ipAddress) {
        return pattern.matcher(ipAddress).matches();
    }
}
