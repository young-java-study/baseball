package com.example.baseball;

import java.util.Scanner;

public class Main {

  private static boolean START = true;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (START) {
      RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
      while (true) {
        ShowMessage.showInputMessage();

        CheckUserNumber checkUserNumber = new CheckUserNumber(scanner.nextInt());
        CompareNumber compareNumber = new CompareNumber(checkUserNumber.getUserNumber(),
            randomNumberGenerator.getRandomNumber());
        ShowResult showResult = new ShowResult(compareNumber.getBallResult(),
            compareNumber.getStrikeResult());

        System.out.println(showResult.getMESSAGE());
        if (compareNumber.getStrikeResult() == 3) {
          break;
        }

      }
      ShowMessage.printSuccessMessage();
      ShowMessage.askRestart();
      GameRestartController gameRestartController = new GameRestartController(scanner.nextInt());
      START = gameRestartController.getGameRestartChoice();
    }
  }
}

