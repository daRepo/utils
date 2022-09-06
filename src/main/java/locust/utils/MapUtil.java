/*
 * .
 */
package locust.utils;

import java.util.HashMap;

/**
 *
 * @author stnal
 */
public class MapUtil {

    public static HashMap<String, String[]> map = new HashMap();
    public static HashMap<String, String> countiesMap = new HashMap();

    public static void init() {

        map.put("(trans)", new String[]{"VENT SERVICII", "0000000000"});
        map.put("(PR)", new String[]{"vanz. prod.", "STOCURI"});
        map.put("n", new String[]{"VZ MARFA", "STOCURI"});
        map.put("(avans)", new String[]{"AVANS", "STOCURI"});

        countiesMap.put("B", "Bucuresti");
        countiesMap.put("AB", "Alba");
        countiesMap.put("AR", "Arad");
        countiesMap.put("AG", "Arges");
        countiesMap.put("BC", "Bacau");
        countiesMap.put("BH", "Bihor");
        countiesMap.put("BN", "Bistrita-Nasaud");
        countiesMap.put("BT", "Botosani");
        countiesMap.put("BV", "Brasov");
        countiesMap.put("BR", "Braila");
        countiesMap.put("BZ", "Buzau");
        countiesMap.put("CS", "Caras-Severin");
        countiesMap.put("CL", "Calarasi");
        countiesMap.put("CJ", "Cluj");
        countiesMap.put("CT", "Constanta");
        countiesMap.put("CV", "Covasna");
        countiesMap.put("DB", "Dambovita");
        countiesMap.put("DJ", "Dolj");
        countiesMap.put("GL", "Galati");
        countiesMap.put("GR", "Giurgiu");
        countiesMap.put("GJ", "Gorj");
        countiesMap.put("HR", "Harghita");
        countiesMap.put("HD", "Hunedoara");
        countiesMap.put("IL", "Ialomita");
        countiesMap.put("IS", "Iasi");
        countiesMap.put("IF", "Ilfov");
        countiesMap.put("MM", "Maramures");
        countiesMap.put("MH", "Mehedinti");
        countiesMap.put("MS", "Mures");
        countiesMap.put("NT", "Neamt");
        countiesMap.put("OT", "Olt");
        countiesMap.put("PH", "Prahova");
        countiesMap.put("SM", "Satu Mare");
        countiesMap.put("SJ", "Salaj");
        countiesMap.put("SB", "Sibiu");
        countiesMap.put("SV", "Suceava");
        countiesMap.put("TR", "Teleorman");
        countiesMap.put("TM", "Timis");
        countiesMap.put("TL", "Tulcea");
        countiesMap.put("VL", "Valcea");
        countiesMap.put("VS", "Vaslui");
        countiesMap.put("VN", "Vrancea");
    }
}
