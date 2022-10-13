@kamil
Feature: US005 Blue RentaCar Login
  Scenario: TC11 kullanici gecerli bilgilerle giris yapar

    Given kullanici "brcUrl" ana sayfasinda
    Then kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And gecersiz username girer
    Then kullanici 2 saniye bekler
    And gecersiz password girer
    And Login butonuna basar
    Then kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    Then kullanici 2 saniye bekler
    And kulllanici sayfayi kapatir


