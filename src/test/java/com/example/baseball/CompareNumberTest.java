package com.example.baseball;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareNumberTest {

  @Test
  void countStrike() {
    int[] userNumberList = {1,5,7};
    int[] randomNumberList = {1,5,7};
    CompareNumber compareNumber = new CompareNumber(randomNumberList);

    assertThat(compareNumber.countStrike(userNumberList)).isEqualTo(3);
  }
  @Test
  void countBall() {
    int[] userNumberList = {1,5,7};
    int[] randomNumberList = {5,1,2};
    CompareNumber compareNumber = new CompareNumber(randomNumberList);

    assertThat(compareNumber.countBall(userNumberList)).isEqualTo(2);
  }
}