package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Bolcom_Page {

    public Bolcom_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id='js-first-screen-accept-all-button']")
    public WebElement cookieAcceptButton;

    @FindBy (xpath = "//*[@class='ui-btn ui-btn--primary  u-disable-mouse js-country-language-btn']")
    public WebElement taalKiezenButton;

    @FindBy (css = "input#searchfor")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='h1 bol_header']")
    public WebElement zoekresultaat;

    @FindBy (css = "select#sort")
    public WebElement dropdownMenu_Prijs;

    @FindBy (xpath = "//a[@id='9200000018800309']")
    public WebElement productBestelknop;

    @FindBy (css = "a.js_close_modal_window")
    public WebElement verderWinkelenKnop;

    @FindBy (xpath = "(//a[@class='product-title px_list_page_product_click list_page_product_tracking_target u-mr--xs'])[3]")
    public WebElement derdeProductvanLijst;

    @FindBy (xpath = "//span[@data-test= 'price-info-srt-text']")
    public WebElement prijsvanHetProduct;

    @FindBy (xpath = "(//div[@class='product-item__image hit-area js_deferred_image_trigger'])[3]")
    public WebElement kies_Parfum;

    @FindBy (xpath = "//span[@data-test='price-info-srt-text']")
    public WebElement prijsvanParfum;

    @FindBy (xpath = "//button[@class='wsp-main-nav__link  js_category_menu_button']")
    public WebElement Categorieen;

    @FindBy (css = "li[data-nav-id='10']")
    public WebElement Eten_Drinken;

    @FindBy (xpath = "//*[text()='Koffie & Thee']")
    public WebElement Koffie_Thee;

    @FindBy (xpath = "//a[text()='Alles in koffie']")
    public WebElement allesInKoffie;

    @FindBy (xpath = "//a[text()='Koffie']")
    public WebElement koffie_button;

    @FindBy (xpath = "(//*[@itemprop='price'])[2]")
    public WebElement prijsvan2Koffie;

}
