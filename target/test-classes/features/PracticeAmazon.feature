@PracticeAmazon
Feature: Amazon Practice

  @PracticeAmazonTC01
  Scenario: Amazon Sign in Test
    When  kullanici Amazon web sitesine gider
    And  sign in butonuna tiklar
    And  faker kullanarak e-posta gonderir
    And  gonderdigi e-postanın ekran goruntusunu alir
    And  continiue'a tiklar
    Then  There was a problem mesajini dogrular
    And  Need help e tiklar
    And  forgot your password e tiklar
    And  Password assistance metnini dogrular
    And  Geri gider
    And  Create your account butonuna tiklar
    When  Create account metnini dogrular
    And  sayfayi kapatir