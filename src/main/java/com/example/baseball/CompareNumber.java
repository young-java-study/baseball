package com.example.baseball;

import java.util.HashSet;

public class CompareNumber {

  private int STRIKE = 0;
  private int BALL = 0;
  private final int NUMBER_LENGTH = 3;

  public CompareNumber(int[] userNumber, int[] randomNumber) {
    countStrike(userNumber, randomNumber);
    countBall(userNumber, randomNumber);
  }

  public void countStrike(int[] userNumber, int[] randomNumber) {
    for (int i = 0; i < NUMBER_LENGTH; i++) {
      if (userNumber[i] == randomNumber[i]) {
        STRIKE++;
      }
    }
  }

  public void countBall(int[] userNumber, int[] randomNumber) {
    HashSet<Integer> set = new HashSet<>();
    for(int number : userNumber){
      set.add(number);
    }
    for (int i = 0; i < NUMBER_LENGTH; i++) {
      if (set.contains(randomNumber[i])&&userNumber[i]!=randomNumber[i]){
        BALL++;
      }
    }
  }

  public int getStrikeResult() {
    return STRIKE;
  }

  public int getBallResult() {
    return BALL;
  }

}
