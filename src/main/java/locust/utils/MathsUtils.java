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

    public static BigDecimal normalise(BigDecimal v_t1, BigDecimal v_t2, BigDecimal v_t3, BigDecimal v_t4, String v_expected) {

        BigDecimal sum = v_t1.add(v_t2).add(v_t3).add(v_t4);

        BigDecimal expected = new BigDecimal(v_expected);
        expected = expected.divide(new BigDecimal("1.19"), 6, RoundingMode.HALF_EVEN);
        BigDecimal diff = sum.subtract(expected);
        return diff;
    }

    public static String getBigger(BigDecimal t1, BigDecimal t2, BigDecimal t3, BigDecimal t4) {

        t1 = toPositive(t1);
        t2 = toPositive(t2);
        t3 = toPositive(t3);
        t4 = toPositive(t4);

        BigDecimal[] numbers = new BigDecimal[]{t1, t2, t3, t4};
        Boolean[][] bool = new Boolean[4][4];

        for (int index = 0; index < numbers.length; index++) {

            BigDecimal bd1 = numbers[index];

            for (int i = 0; i < numbers.length; i++) {

                BigDecimal bd2 = numbers[i];

                int currInt = bd1.compareTo(bd2);

                if (currInt == 1 || currInt == 0) {

                    bool[index][i] = true;
                } else {

                    bool[index][i] = false;
                }
            }
        }

        if (bool[0][0] && bool[0][1] && bool[0][2] && bool[0][3]) {

            return "t1";
        }

        if (bool[1][0] && bool[1][1] && bool[1][2] && bool[1][3]) {

            return "t2";
        }

        if (bool[2][0] && bool[2][1] && bool[2][2] && bool[2][3]) {

            return "t3";
        }

        if (bool[3][0] && bool[3][1] && bool[3][2] && bool[3][3]) {

            return "t4";
        }

        return null;
    }

    public static BigDecimal toPositive(BigDecimal v_input) {

        double dVal = v_input.doubleValue();

        if (dVal < 0) {

            return new BigDecimal(dVal).multiply(new BigDecimal(-1));
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
