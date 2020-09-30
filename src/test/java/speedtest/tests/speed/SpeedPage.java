package speedtest.tests.speed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpeedPage {
    private WebDriver driver;

    public SpeedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "org.zwanoo.android.speedtest:id/go_button")
    private WebElement goBtn;

    @FindBy (id = "org.zwanoo.android.speedtest:id/host_assembly_item_connections")
    private WebElement hostAssemblyItemConnections;

    @FindBy (id = "org.zwanoo.android.speedtest:id/host_assembly_item_server")
    private WebElement hostAssemblyItemServer;

    @FindBy (id = "org.zwanoo.android.speedtest:id/host_assembly_item_provider")
    private WebElement hostAssemblyItemProvider;

    public boolean goBtnIsDisplayed() {
        return goBtn.isDisplayed();
    }

    public boolean networkDataIsDisplayed() {
        return hostAssemblyItemConnections.isDisplayed() && hostAssemblyItemProvider.isDisplayed() && hostAssemblyItemServer.isDisplayed();
    }
}
