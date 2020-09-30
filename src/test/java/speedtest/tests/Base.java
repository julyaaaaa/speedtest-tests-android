package speedtest.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import speedtest.tests.speed.SpeedPage;
import speedtest.tests.vpn.VpnPage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static speedtest.tests.Data.APP;
import static speedtest.tests.Data.DEVICE_NAME;

public abstract class Base {
    public static AndroidDriver<AndroidElement> driver = null;

    protected static DesiredCapabilities capabilities;
    protected static SpeedPage speedPage;
    protected static MenuPage menuPage;
    protected static VpnPage vpnPage;
    protected static InfoPage infoPage;

    @BeforeClass
    public static void setUp() {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.APP, APP);
        capabilities.setCapability("appWaitActivity", "com.ookla.mobile4.screens.welcome.WelcomeActivity");
        capabilities.setCapability("appWaitPackage", "org.zwanoo.android.speedtest");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        try {
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        speedPage = new SpeedPage(driver);
        menuPage = new MenuPage(driver);
        vpnPage = new VpnPage(driver);
        infoPage = new InfoPage(driver);
    }

    @Before
    public void launchApp() {
        driver.launchApp();
    }

    @After
    public void close() {
        driver.closeApp();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
