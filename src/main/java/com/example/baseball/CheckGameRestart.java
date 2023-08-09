package com.example.baseball;

public class CheckGameRestart {

  private final static int RESTART = 1;
  private final static int EXIT = 2;

  public static boolean checkRestart(int userRestartChoice) {
    if (userRestartChoice != RESTART && userRestartChoice != EXIT) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }

    if (userRestartChoice == RESTART) {
      return true;
    }
    return false;
  }
}


