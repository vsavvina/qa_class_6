package tests;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.*;

public class SelListIssueRep {
String repository = "vsavvina/java_8_3_class";
  @Test
  public void IssTestGit() {
    SelenideLogger.addListener("allure", new AllureSelenide());

    open("https://github.com/");

    $(".header-search-input").setValue(repository).
            as("Клик по полю поиска").submit();

    sleep(3000);
  }
}
