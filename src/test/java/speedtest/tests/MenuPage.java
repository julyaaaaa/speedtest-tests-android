package speedtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
    private WebDriver driver;

    public MenuPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "org.zwanoo.android.speedtest:id/tab_vpn")
    private WebElement vpnTab;

    public void clickOnVpnTab() {
        vpnTab.click();
    }
}
