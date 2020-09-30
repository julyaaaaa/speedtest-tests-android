package speedtest.tests.vpn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VpnPage {
    private WebDriver driver;

    public VpnPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "org.zwanoo.android.speedtest:id/vpn_switch_layout_toggle")
    private WebElement vpnSwitchLayoutToggle;

    public boolean vpnSwitchToggleIsDisplayed() {
        return vpnSwitchLayoutToggle.isDisplayed();
    }

}
