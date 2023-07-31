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


}
