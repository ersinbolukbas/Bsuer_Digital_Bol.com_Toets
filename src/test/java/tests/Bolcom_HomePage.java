package tests;

import org.testng.annotations.Test;
import pages.Bolcom_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Bolcom_HomePage {

    Bolcom_Page bolcomPage;
    @Test
    public void Opdracht_Test_1() {
        // Het gaat naar het URL-adres van bol.com.
        Driver.getDriver().get(ConfigReader.getProperty("bolURL"));

        ReusableMethods.waitFor(1); // We moeten wachten om cookies te uploaden
        bolcomPage = new Bolcom_Page();

        bolcomPage.cookieAcceptButton.click();

        ReusableMethods.waitFor(1); // Er moeten pop-ups voor taalselectie worden upgeladen.
        bolcomPage.taalKiezenButton.click();

        ReusableMethods.waitFor(1); // Er moeten home pagina worden upgeladen.

    }
}
