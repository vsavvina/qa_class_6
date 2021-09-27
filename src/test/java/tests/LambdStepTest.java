package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LambdStepTest {

  private final static String repository = "vsavvina/qa_class_6";

  @Test
  public void IssTestGit(){

    step("Opening the GitHub pages", () -> {
      open("https://github.com/");
    } );

    step("Search for a repository", () -> {
      $(".header-search-input").setValue(repository).submit();
    } );

    step("Going to the first search result", () -> {
      $$("ul.repo-list li").first().$("a").click();
    } );

    step("Checking the visibility of Issues", () -> {
      $x("//*[@id=\"repository-container-header\"]/nav/ul/li[2]")
              .should(visible);
    });
  }
}
