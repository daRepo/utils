/*
 * .
 */
package locust.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author stnal
 */
public class MathsUtils {

    @Deprecated
    public static BigDecimal normalise(BigDecimal v_t1, BigDecimal v_t2, BigDecimal v_t3, BigDecimal v_t4, String v_expected) {

        BigDecimal sum = v_t1.add(v_t2).add(v_t3).add(v_t4);

        BigDecimal expected = new BigDecimal(v_expected);
        expected = expected.divide(new BigDecimal("1.19"), 6, RoundingMode.HALF_EVEN);
        BigDecimal diff = sum.subtract(expected);
        return diff;
    }

    public static BigDecimal getBigger(BigDecimal... number) {

        BigDecimal biggest = number[0];

        for (int i = 1; i < number.length; i++) {

            if (number[i].compareTo(biggest) == 1) {

                biggest = number[i];
            }
        }
        return biggest;
    }

    public static BigDecimal toPositive(BigDecimal v_input) {

        if (v_input.compareTo(new BigDecimal(0)) == -1) {

            return v_input.negate();
        } else {

            return v_input;
        }
    }

    public static boolean isPositive(String v_input) {

        BigDecimal input = new BigDecimal(v_input);

        if (input.signum() == -1) {

            return false;
        } else {

            return true;
        }
    }
}
