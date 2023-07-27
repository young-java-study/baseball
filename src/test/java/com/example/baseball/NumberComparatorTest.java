package com.example.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberComparatorTest {

  @Test
  @DisplayName("스트라이크가 1개인지 확인")
  void strikeCountTest_1() {
    int[] computerNumber = {3, 8, 7};
    int[] userNumber = {4, 8, 9};
    NumberComparator numberComparator = new NumberComparator();
    int strikeCount = numberComparator.strikeCount(computerNumber, userNumber);
    Assertions.assertThat(strikeCount).isEqualTo(1);
  }

  @Test
  @DisplayName("스트라이크가 3개인지 확인")
  void strikeCountTest_2() {
    int[] computerNumber = {8, 1, 2};
    int[] userNumber = {8, 1, 2};
    NumberComparator numberComparator = new NumberComparator();
    int strikeCount = numberComparator.strikeCount(computerNumber, userNumber);
    Assertions.assertThat(strikeCount).isEqualTo(3);
  }

  @Test
  @DisplayName("스트라이크 예외처리 확인")
  void strikeCountCheck_throw_exception() {
    int[] computerNumber = {3, 8, 4};
    int[] userNumber = {4, 8, 9, 7};
    // 이 예외를 테스트 하지 않는 이유는 userNumber를 입력받을 때 3자리수가 아니면
    // 예외처리하기 때문에 절대 발생하지 않음.
    // 이 외에는 어떤 내용을 테스트 해야하는지 모르겠음.
  }

  @Test
  @DisplayName("볼이 0개인지 확인")
  void ballCountCheck_1() {
    int[] computerNumber = {9, 1, 6};
    int[] userNumber = {8, 7, 2};
    NumberComparator numberComparator = new NumberComparator();
    int ballCount = numberComparator.ballCount(computerNumber, userNumber);
    Assertions.assertThat(ballCount).isEqualTo(0);
  }
  @Test
  @DisplayName("볼이 3개인지 확인")
  void ballCountCheck_2() {
    int[] computerNumber = {3, 8, 7};
    int[] userNumber = {7, 3, 8};
    NumberComparator numberComparator = new NumberComparator();
    int ballCount = numberComparator.ballCount(computerNumber, userNumber);
    Assertions.assertThat(ballCount).isEqualTo(3);
  }
}