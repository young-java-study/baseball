package com.example.baseball;

public class ShowMessage {

  public static void showInputMessage() {
    System.out.print("숫자를 입력해 주세요 : ");
  }

  public static void printSuccessMessage() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }

  public static String exceptionMessage() {
    return ("유효한 3자리 숫자를 입력해주세요.");
  }

  public static void askRestart() {
    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
  }

  public static void resultStatus(int balls, int strikes) {
    if (balls == 0 && strikes == 0) {
      System.out.println("낫싱");
    }
    if (balls == 0 && strikes != 0) {
      System.out.println(strikes + "스트라이크");
    }
    if (balls != 0 && strikes == 0) {
      System.out.println(balls + "볼");
    }
    if (balls != 0 && strikes != 0) {
      System.out.println(balls + "볼 " + strikes + "스트라이크");
    }
  }
}
