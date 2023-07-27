package com.example.baseball;

import java.util.Scanner;

public class ResultOutput {
  private static final int RESTART = 1;
  private static final int GAME_OVER = 2;

  public String showResult(int strikeCount, int ballCount) {
    if (strikeCount != 0 && ballCount == 0) {
      return strikeCount + "스트라이크";
    }
    if (strikeCount == 0 && ballCount != 0) {
      return ballCount + "볼";
    }
    if (strikeCount != 0 && ballCount != 0) {
      return ballCount + "볼 " + strikeCount + "스트라이크";
    }
    if (strikeCount == 0 && ballCount == 0) {
      return "낫싱";
    }
    return "";
    //이 부분도 아래의 질문처럼 위의 낫싱 부분을 없애고
    //바로 낫싱을 리턴하면 되는지 궁금합니다!
  }

  public boolean askToRestartOrExit() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    int askRestart = scanner.nextInt();
    if (askRestart == RESTART) {
      return true;
    }
    if (askRestart == GAME_OVER){
      return false;
    }
    throw new IllegalArgumentException("올바른 입력이 아닙니다.");
    //여기서 이렇게 조건을 둘 다 확인해서 예외처리를 해야하는지 아니면
    // if문을 하나만 작성하여 restart할때만 확인하고 그게 아니면 false를 리턴할지 아래의 코드를 예시로 작성
    /* ex) 아래코드
    if (isGameover == restart) {

      return true;
    }
    return false;
     */
  }
}
