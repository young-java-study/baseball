package com.example.baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareNumberTest {
  @Test
  @DisplayName("countBall테스트")
  public void testCountBall() {
    int[] userNumber = {1, 2, 3};
    int[] randomNumber = {3, 1, 2};

    CompareNumber compareNumber = new CompareNumber(userNumber,randomNumber);
    int ballCount = compareNumber.countBall();

    assertEquals(3, ballCount);
  }
  @Test
  @DisplayName("countStrike테스트")
  public void testCountStrike() {
    int[] userNumber = {8, 1, 3};
    int[] randomNumber = {1, 4, 3};

    CompareNumber compareNumber = new CompareNumber(userNumber,randomNumber);
    int strikeCount = compareNumber.countStrike();

    assertEquals(1, strikeCount);
  }

}