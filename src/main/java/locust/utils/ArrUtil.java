/*
 * .
 */
package locust.utils;

import java.util.List;

/**
 *
 * @author stnal
 */
public class ArrUtil {
    
    private String divider = ",";

    public static boolean arrContains(String[] list, String string) {

        for (String curr : list) {

            if (curr.equalsIgnoreCase(string)) {
                return true;
            }
        }
        return false;
    }

    public static boolean arrContains(List<String> list, String string) {

        for (String curr : list) {

            if (curr.equalsIgnoreCase(string)) {
                return true;
            }
        }
        return false;
    }

    public static void addUniqueString(List<String> v_list, String v_string) {

        if (!arrContains(v_list, v_string)) {

            v_list.add(v_string);
        }
    }
}
