package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Bolcom_Page;
import utilities.ReusableMethods;

public class ExtractieVanPrijzen {
    Bolcom_Page bolcomPage;
    Bolcom_HomePage bolcomHomePage;
    @Test
    public void Opdracht_Laptop() {
        bolcomPage = new Bolcom_Page();
        bolcomHomePage = new Bolcom_HomePage();
        bolcomHomePage.Opdracht_Test_1();

        // String gezochtProduct = "Laptop"; // vanwege StaleElementReferenceException kan het niet dynamisch worden.
        String gezochtProduct = "Laptop";
        bolcomPage.searchBox.sendKeys(gezochtProduct + Keys.ENTER);
        String actualGezochtProduct = bolcomPage.zoekresultaat.getText();

        // Wij bevestigden dat het product dat we zochten hetzelfde was als het verwachte resultaat.
        Assert.assertTrue(actualGezochtProduct.contains(gezochtProduct));

        // We moeten nu een dropdown menu kiezen als "prijs laag-hoog"
        Select select = new Select(bolcomPage.dropdownMenu_Prijs);
        String dropDown_PriceLaagHoog = "price0";
        select.selectByValue(dropDown_PriceLaagHoog);

        // Laten we het derde laptopproduct selecteren.
        bolcomPage.derdeProductvanLijst.click();
        ReusableMethods.waitFor(1); // Nieuwe pagina moet uploaden.

        // De prijs van het product wordt afgedrukt.
        String prijsvanHetProductText = bolcomPage.prijsvanHetProduct.getText();
        System.out.println(prijsvanHetProductText);

    }





}
