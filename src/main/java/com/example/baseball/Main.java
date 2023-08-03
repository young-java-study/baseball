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
        ShowResult showResult = new ShowResult(compareNumber.countBall(),
            compareNumber.countStrike());
        System.out.println(showResult.getMESSAGE());
        if (compareNumber.countStrike() == 3) {
          break;
        }

      }
      ShowMessage.printSuccessMessage();
      ShowMessage.askRestart();
      CheckGameRestart checkGameRestart = new CheckGameRestart(scanner.nextInt());
      START = checkGameRestart.getGameRestartChoice();
    }
  }
}

