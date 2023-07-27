package com.example.baseball;

public class NumberComparator {

  public int strikeCount(int[] computerNumber, int[] userNumber) {
    int strikeCount = 0;
    for (int i = 0; i < computerNumber.length; i++) {
      if (computerNumber[i] == userNumber[i]) {
        strikeCount++;
      }
    }
    return strikeCount;
  }

  public int ballCount(int[] computerNumber, int[] userNumber) {
    int ballCount = 0;
    for (int i = 0; i < computerNumber.length; i++) {
      if (i == 0) {
        continue;
      }
      if (computerNumber[0] == userNumber[i]) {
        ballCount++;
      }
    }
    for (int i = 0; i < computerNumber.length; i++) {
      if (i == 1) {
        continue;
      }
      if (computerNumber[1] == userNumber[i]) {
        ballCount++;
      }
    }
    for (int i = 0; i < computerNumber.length; i++) {
      if (i == 2) {
        continue;
      }
      if (computerNumber[2] == userNumber[i]) {
        ballCount++;
      }
    }
    return ballCount;

  }
}
