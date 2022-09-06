/*
 * .
 */
package locust.utils;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author stnal
 */
public class ResLoader {

    public ImageIcon getImg(String v_innerSource) throws IOException {

        return new ImageIcon(ImageIO.read(getClass().getClassLoader().getResource(v_innerSource)));
    }
}
