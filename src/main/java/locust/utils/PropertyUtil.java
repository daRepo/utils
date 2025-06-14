/*
 * .
 */
package locust.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stnal
 */
public class PropertyUtil {

    Properties prop;
    boolean innerJar;
    String source;
    InputStream input = null;

    public PropertyUtil(String v_source, boolean v_innerJar) {

        try {
            prop = new Properties();
            innerJar = v_innerJar;
            source = v_source;
            load();
            prop.load(input);
        } catch (IOException ex) {
            Logger.getLogger(PropertyUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void load() {
        try {
            if (innerJar) {
                // Read the resource from the classloader directly
                input = getClass().getClassLoader().getResourceAsStream(source);
                if (input == null) {
                    throw new FileNotFoundException("Resource not found in JAR: " + source);
                }
            } else {
                // Read from file system
                input = new FileInputStream(new File(source));
            }
        } catch (Exception ex) {
            Logger.getLogger(PropertyUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getProperty(String v_propertyName) {

        return prop.getProperty(v_propertyName);
    }
}
