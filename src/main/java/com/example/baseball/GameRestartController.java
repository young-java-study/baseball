package com.example.baseball;

public class GameRestartController {
  private boolean RESTART = true;
  public GameRestartController(int userRestartChoice){
    if (userRestartChoice!=1&&userRestartChoice!=2) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }
    checkRestart(userRestartChoice);

  }
  public void checkRestart(int userRestartChoice){
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
