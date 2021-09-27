package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepForTest {

  @Step("Opening the GitHub pages")
    public void openinGitHub (String url) {
    open(url);
  }

  @Step("Search for a repository")
  public void searchrep (String repozit) {
    $(".header-search-input").setValue(repozit).submit();
  }

  @Step("Going to the first search result")
  public void goToFirstRes () {
    $$("ul.repo-list li").first().$("a").click();
  }

  @Step("Checking the visibility of Issues")
  public void checkVisib () {
    $x("//*[@id=\"repository-container-header\"]/nav/ul/li[2]")
            .should(Condition.visible);
  }
}
