/*
 * .
 */
package locust.utils;

import java.io.File;

/**
 *
 * @author stnal
 */
public class FileUtils {
    
    public static File[] getAllFiles(String v_dirPath) {
    
        File fl = new File(v_dirPath);
        return fl.listFiles();
    }
}
