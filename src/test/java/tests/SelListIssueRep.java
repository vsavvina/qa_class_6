package tests;

import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

import static com.codeborne.selenide.Selenide.*;

public class SelListIssueRep {

String repository = "vsavvina/qa_class_6";

  @Test
  public void IssTestGit() {
    SelenideLogger.addListener("allure", new AllureSelenide());

    open("https://github.com/");

    $(".header-search-input").setValue(repository).
            as("Search for a repository").submit();
    $$("ul.repo-list li").first().$("a").
            as("Going to the first search result").click();
    $x("//*[@id=\"repository-container-header\"]/nav/ul/li[2]").
            as("Checking the visibility of Issues").should(visible);
  }
}
