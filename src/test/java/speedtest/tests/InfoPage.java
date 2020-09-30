package speedtest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfoPage {
    private WebDriver driver;

    public InfoPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (id = "org.zwanoo.android.speedtest:id/logoIcon")
    private WebElement logoIcon;

    @FindBy (id = "org.zwanoo.android.speedtest:id/ookla_top_bar_logo_text")
    private WebElement logoText;

    public boolean logoIconIsDisplayed() {
        return logoIcon.isDisplayed();
    }

    public String getLogoText() {
        return logoText.getText();
    }


}
