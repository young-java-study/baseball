package com.example.baseball;

import java.util.HashSet;

public class CheckUserNumber {
  private static final int NUMBER_LENGTH = 3;
  private int[] userNumberList = new int[NUMBER_LENGTH];
  private final static int MIN_NUMBER = 100;
  private final static int MAX_NUMBER = 999;


  public CheckUserNumber(int userInput) {
    if (MIN_NUMBER > userInput || userInput > MAX_NUMBER) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }
    splitNumbersToArray(userInput);
    isUnique(userNumberList);
  }

  private void splitNumbersToArray(int userInput) {
    for (int i = 2; i >= 0; i--) {
      userNumberList[i] = userInput % 10;
      userInput /= 10;
    }
  }

  private void isUnique(int[] userInput) {
    HashSet<Integer> numberSet = new HashSet<>();
    for (int num : userInput) {
      if (numberSet.contains(num)) {
        throw new IllegalArgumentException(ShowMessage.exceptionMessage());
      }
      numberSet.add(num);
    }
  }

  public int[] getUserNumber() {
    return userNumberList;
  }
}
