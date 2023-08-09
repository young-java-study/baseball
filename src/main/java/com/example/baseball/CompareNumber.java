package com.example.baseball;

import java.util.HashSet;

public class CompareNumber {

  private static final int NUMBER_LENGTH = 3;
  private int[] randomNumber;

  public CompareNumber(int[] randomNumber) {
    this.randomNumber = randomNumber;
  }

  public int countStrike(int[] userNumber) {
    int strike = 0;
    for (int i = 0; i < NUMBER_LENGTH; i++) {
      if (userNumber[i] == randomNumber[i]) {
        strike++;
      }
    }
    return strike;
  }

  public int countBall(int[] userNumber) {
    HashSet<Integer> set = new HashSet<>();
    int ball = 0;
    for (int number : userNumber) {
      set.add(number);
    }
    for (int i = 0; i < NUMBER_LENGTH; i++) {
      if (set.contains(randomNumber[i]) && userNumber[i] != randomNumber[i]) {
        ball++;
      }
    }
    return ball;
  }

}
