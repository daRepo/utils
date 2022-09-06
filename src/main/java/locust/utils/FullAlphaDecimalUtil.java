/*
 * .
 */
package locust.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author stnal
 */
public class FullAlphaDecimalUtil {

    public static HashMap<Long, String> decimalMap = new HashMap();

    public FullAlphaDecimalUtil() {

        decimalMap.put(0l, "0");
        decimalMap.put(1l, "1");
        decimalMap.put(2l, "2");
        decimalMap.put(3l, "3");
        decimalMap.put(4l, "4");
        decimalMap.put(5l, "5");
        decimalMap.put(6l, "6");
        decimalMap.put(7l, "7");
        decimalMap.put(8l, "8");
        decimalMap.put(9l, "9");
        decimalMap.put(10l, "a");
        decimalMap.put(11l, "b");
        decimalMap.put(12l, "c");
        decimalMap.put(13l, "d");
        decimalMap.put(14l, "e");
        decimalMap.put(15l, "f");
        decimalMap.put(16l, "g");
        decimalMap.put(17l, "h");
        decimalMap.put(18l, "i");
        decimalMap.put(19l, "j");
        decimalMap.put(20l, "k");
        decimalMap.put(21l, "l");
        decimalMap.put(22l, "m");
        decimalMap.put(23l, "n");
        decimalMap.put(24l, "o");
        decimalMap.put(25l, "p");
        decimalMap.put(26l, "q");
        decimalMap.put(27l, "r");
        decimalMap.put(28l, "s");
        decimalMap.put(29l, "t");
        decimalMap.put(30l, "u");
        decimalMap.put(31l, "v");
        decimalMap.put(32l, "w");
        decimalMap.put(33l, "x");
        decimalMap.put(34l, "y");
        decimalMap.put(35l, "z");
    }

    public String to36Decimal(long number) {

        long quotient = 1;
        long remainder = number;
        List<Long> chars = new ArrayList();
        String returnable = "";

        while (quotient != 0) {

            quotient = (remainder - remainder % 36) / 36;
            chars.add(remainder % 36);
            remainder = quotient;
        }

        for (int i = chars.size() - 1; i >= 0; i--) {

            returnable += decimalMap.get(chars.get(i));
        }
        return returnable;
    }
}
