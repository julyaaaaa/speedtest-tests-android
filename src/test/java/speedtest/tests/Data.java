package speedtest.tests;

import java.io.IOException;
import java.util.Properties;

public class Data {
    public static String APP;
    public static String DEVICE_NAME = "Nexus6";

    static {
        Properties p = new Properties();
        try {
            p.load(Data.class.getClassLoader().getResourceAsStream("test.properties"));
            APP = String.format("%s/%s", p.getProperty("project.basedir"), "Speedtest_v.4.5.17.apk");
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
