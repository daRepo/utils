/*
 * .
 */
package locust.utils;

import java.util.regex.Pattern;

/**
 *
 * @author stnal
 */
public class RegexUtil {

    public static boolean match(String v_comparable, String v_pattern) {

        Pattern p = Pattern.compile(v_pattern);
        return p.matcher(v_comparable).matches();
    }
}
