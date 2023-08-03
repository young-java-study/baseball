package com.example.baseball;

import java.util.HashSet;

public class CheckUserNumber {

  private int[] USER_NUMBER_LIST = new int[3];

  public CheckUserNumber(int userInput) {
    if (100 > userInput || userInput > 999) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }
    splitNumbersToArray(userInput);

    if (!isUnique(USER_NUMBER_LIST)) {
      throw new IllegalArgumentException(ShowMessage.exceptionMessage());
    }
  }

  private void splitNumbersToArray(int userInput) {
    for (int i = 2; i >= 0; i--) {
      USER_NUMBER_LIST[i] = userInput % 10;
      userInput /= 10;
    }
  }

  public boolean isUnique(int[] userInput) {
    HashSet<Integer> numberSet = new HashSet<>();
    for (int num : userInput) {
      if (numberSet.contains(num)) {
        return false;
      }
      numberSet.add(num);
    }
    return true;
  }

  public int[] getUserNumber() {
    return USER_NUMBER_LIST;
  }
}
