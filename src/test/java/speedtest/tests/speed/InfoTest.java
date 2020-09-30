package speedtest.tests.speed;

import org.junit.Test;
import speedtest.tests.Base;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;

public class InfoTest extends Base {
    @Test
    public void CheckInfo() {
        assertTrue(infoPage.logoIconIsDisplayed());
        assertThat(infoPage.getLogoText(), equalTo("SPEEDTEST"));
        assertTrue(speedPage.goBtnIsDisplayed());
        assertTrue(speedPage.networkDataIsDisplayed());

        menuPage.clickOnVpnTab();

        assertTrue(vpnPage.vpnSwitchToggleIsDisplayed());
    }
}
