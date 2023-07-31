package com.example.baseball;

public class ShowResult {

  private String MESSAGE = "";

  public ShowResult(int balls, int strikes) {
    resultStatus(balls, strikes);
  }

  public void resultStatus(int balls, int strikes) {
    if (balls == 0 && strikes == 0) {
      MESSAGE = "낫싱";
    }
    if (balls == 0 && strikes != 0) {
      MESSAGE = strikes + "스트라이크";
    }
    if (balls != 0 && strikes == 0) {
      MESSAGE = balls + "볼";
    }
    if (balls != 0 && strikes != 0) {
      MESSAGE = balls + "볼 " + strikes + "스트라이크";
    }
  }

  public String getMESSAGE() {
    return MESSAGE;
  }


}
