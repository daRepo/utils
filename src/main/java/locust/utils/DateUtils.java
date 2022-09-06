/*
 * .
 */
package locust.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stnal
 */
public class DateUtils {

    public static String getDate() {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return formatter.format(date);
    }

    public static long getCurrentTimeMS() {

        try {
            Thread.sleep(1l);
        } catch (InterruptedException ex) {
            Logger.getLogger(DateUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date date = new Date();
        long returnable = date.getTime();
        return returnable;
    }
}
