package tests;

import org.junit.jupiter.api.Test;

public class TestWithAnntStap {

  public final static String repository = "vsavvina/qa_class_6";
  public final static String gitUrl = "https://github.com/";
  StepForTest stepfortest = new StepForTest();

  @Test
  public void IssTestGit() {
    stepfortest.openinGitHub(gitUrl);
    stepfortest.searchrep(repository);
    stepfortest.goToFirstRes();
    stepfortest.checkVisib();
  }
}
