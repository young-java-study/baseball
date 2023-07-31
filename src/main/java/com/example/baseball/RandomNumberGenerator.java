package com.example.baseball;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberGenerator {

  private final static int[] RANDOM_NUMBER_LIST = new int[3];

  public RandomNumberGenerator() {
    generateRandomNumberList();
  }

  public int generateRandomNumber() {
    Random random = new Random();
    int randomNum = random.nextInt(9) + 1;
    return randomNum;
  }

  public int[] generateRandomNumberList() {
    HashSet<Integer> integerHashSet = new HashSet<>();
    while (integerHashSet.size() < 3) {
      integerHashSet.add(generateRandomNumber());
    }

    int idx = 0;
    for (int number : integerHashSet) {
      RANDOM_NUMBER_LIST[idx++] = number;
    }
    return RANDOM_NUMBER_LIST;
  }

  public int[] getRandomNumber() {
    return RANDOM_NUMBER_LIST;
  }

}
