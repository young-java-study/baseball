package com.example.baseball;

public class CheckGameRestart {
  private boolean RESTART = true;
  public CheckGameRestart(int userRestartChoice){
    if (userRestartChoice!=1&&userRestartChoice!=2) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }
    checkRestart(userRestartChoice);

  }
  private void checkRestart(int userRestartChoice){
    if (userRestartChoice == 1) {
      RESTART = true;
    }
    if (userRestartChoice == 2) {
      RESTART = false;
    }
  }
  public boolean getGameRestartChoice(){
    return RESTART;
  }
}
