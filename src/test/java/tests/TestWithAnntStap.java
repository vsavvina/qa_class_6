package tests;

import org.junit.jupiter.api.Test;

public class TestWithAnntStap {

  StepForTest stepfortest = new StepForTest();
  public String repository = "vsavvina/qa_class_6";
  public String gitUrl = "https://github.com/";

  @Test
  void IssTestGit() {
    stepfortest.openinGitHub(gitUrl);
    stepfortest.searchrep(repository);
    stepfortest.goToFirstRes();
    stepfortest.checkVisib();
  }
}
