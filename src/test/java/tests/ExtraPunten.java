package tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Bolcom_Page;
import utilities.ReusableMethods;

public class ExtraPunten {
    Bolcom_Page bolcomPage;
    Bolcom_HomePage bolcomHomePage;
    @Test
    public void foutAfhandeling() {

        bolcomPage = new Bolcom_Page();
        bolcomHomePage = new Bolcom_HomePage();
        bolcomHomePage.Opdracht_Test_1();

        String gezochtProduct = "Laptop";
        bolcomPage.searchBox.sendKeys(gezochtProduct, Keys.ENTER);
        ReusableMethods.waitFor(1); // Er word pagina moeten uploaden.
        String zochtResultaatText = bolcomPage.zoekresultaat.getText();

        // Hieronder gaan we met andere product vergelijken wat we op hebben gezocht.
        String verwachtendeData = "Thee";

        // We controleren of het resultaat geen "thee" bevat.
        Assert.assertFalse(zochtResultaatText.contains(verwachtendeData));



    }
}
