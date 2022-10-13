package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;
import java.io.IOException;
public class Practice_TC_07steps {

    PracticeTC07Page practiceTC07Page = new PracticeTC07Page();



    @Given("Tarayiciyi baslatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanin basariyla gorunur oldugunu dogrulayin")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @And("Test Case buttonu na tiklayin")
    public void testCaseButtonuNaTiklayin() {
        practiceTC07Page.testCaseLink.click();
    }

    @Then("Kullanicinin test case sayfasina basariyla yonlendirildigini dogrulayin")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }

    @And("Ilgili sayfanin ekran goruntusunu alin")
    public void ılgiliSayfaninEkranGoruntusunuAlin() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
