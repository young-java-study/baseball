package com.example.baseball;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberGeneratorList {

  private static final Random random = new Random();

  public static int[] generateRandomNumberList() {
    int[] RANDOM_NUMBER_LIST = new int[3];
    HashSet<Integer> integerHashSet = new HashSet<>();
    while (integerHashSet.size() < 3) {
      integerHashSet.add(random.nextInt(9) + 1);
    }
    int idx = 0;
    for (int number : integerHashSet) {
      RANDOM_NUMBER_LIST[idx++] = number;
    }
    return RANDOM_NUMBER_LIST;
  }
}
