package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticeNegativePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeNegativeTestStepDefs {
    PracticeNegativePage pntp = new PracticeNegativePage();
    @Given("kullanici {string} sayfasina gider.")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }


    @When("login olmak icin signin e tiklar")
    public void login_olmak_icin_signin_e_tiklar() {
        ReusableMethods.waitForClickablility(pntp.signinSymbol,5);
        pntp.signinSymbol.click();
        pntp.signinButton.click();

    }

    @When("username icin {string} kullanici adini gonderir")
    public void username_icin_kullanici_adini_gonderir(String username) {

        username= Faker.instance().name().username();
        pntp.username.sendKeys(username);

    }

    @When("password icin {string} parolasini gonderir")
    public void password_icin_parolasini_gonderir(String password) {

        password=Faker.instance().internet().password();
        pntp.password.sendKeys(password);

    }

    @When("signine tiklar")
    public void signine_tiklar() {

        pntp.signinWithCredentials.click();

    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
    }


}











