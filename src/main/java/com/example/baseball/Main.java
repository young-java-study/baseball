package com.example.baseball;

import java.util.Scanner;

public class Main {

  private static boolean START = true;
  private final static int THREE_STRIKE = 3;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (START) {
      ShowMessage.showInputMessage();
      CheckUserNumber checkUserNumber = new CheckUserNumber(scanner.nextInt());
      CompareNumber compareNumber = new CompareNumber(RandomNumberGeneratorList.generateRandomNumberList());
      ShowMessage.resultStatus(compareNumber.countBall(checkUserNumber.getUserNumber()),
          compareNumber.countStrike(checkUserNumber.getUserNumber()));

      if (compareNumber.countStrike(checkUserNumber.getUserNumber()) == THREE_STRIKE) {
        ShowMessage.printSuccessMessage();
        ShowMessage.askRestart();
        START = CheckGameRestart.checkRestart(scanner.nextInt());
      }
    }
  }
}