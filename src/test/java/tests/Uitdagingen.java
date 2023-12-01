package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Bolcom_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class Uitdagingen {

    Bolcom_Page bolcomPage;
    Bolcom_HomePage bolcomHomePage;

    @Test
    public void Uitdagingen_eersteOpdracht() {
        bolcomPage = new Bolcom_Page();
        bolcomHomePage = new Bolcom_HomePage();
        bolcomHomePage.Opdracht_Test_1();

        // Ik zal "invictus paco rabanne" zoeken.
        String gezochtParfum= "invictus paco rabanne";
        bolcomPage.searchBox.sendKeys(gezochtParfum + Keys.ENTER);

        // Eerste product word in het winkelmandje toevoegen.
        bolcomPage.productBestelknop.click();
        ReusableMethods.waitFor(1);

        // Werder Winkelen knop word gedrukt.
        bolcomPage.verderWinkelenKnop.click();
        ReusableMethods.waitFor(1);

        // prijs van vierde product
        bolcomPage.kies_Parfum.click();
        String prijsvanHetParfum = bolcomPage.prijsvanParfum.getText();
        System.out.println(prijsvanHetParfum);
    }


    @Test
    public void Koffie_Thee() {
        bolcomPage = new Bolcom_Page();
        bolcomHomePage = new Bolcom_HomePage();
        bolcomHomePage.Opdracht_Test_1();

        // We moeten muis gebruiken om een categorie te kiezen.
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(bolcomPage.Categorieen).perform();
        ReusableMethods.waitFor(1); // Om zichtbaar te zijn wat we hebben gedaan. En pagina moet er uploaden.
        actions.moveToElement(bolcomPage.Eten_Drinken).perform();
        ReusableMethods.waitFor(1); // Om zichtbaar te zijn wat we hebben gedaan. En pagina moet er uploaden.
        actions.moveToElement(bolcomPage.Koffie_Thee).perform();
        ReusableMethods.waitFor(1); // Om zichtbaar te zijn wat we hebben gedaan. En pagina moet er uploaden.
        actions.click(bolcomPage.allesInKoffie).perform();
        ReusableMethods.waitFor(1); // Om zichtbaar te zijn wat we hebben gedaan. En pagina moet er uploaden.
        actions.click(bolcomPage.koffie_button).perform();
        ReusableMethods.waitFor(1); // Om zichtbaar te zijn wat we hebben gedaan. En pagina moet er uploaden.

        String TweedeKoffiePrijs = bolcomPage.prijsvan2Koffie.getText();
        System.out.println(TweedeKoffiePrijs);


    }
}
