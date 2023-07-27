package com.example.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultOutputTest {
  @Test
  @DisplayName("낫싱이 잘 나오는지 확인")
  void showResultTest_1(){
    int strikeCount=0;
    int ballCount=0;
    ResultOutput resultOutput = new ResultOutput();
    String resultCheck = resultOutput.showResult(strikeCount,ballCount);
    Assertions.assertThat(resultCheck).isEqualTo("낫싱");
  }
  @Test
  @DisplayName("스트라이크만 나오는지 확인")
  void showResultTest_2(){
    int strikeCount=2;
    int ballCount=0;
    ResultOutput resultOutput = new ResultOutput();
    String resultCheck = resultOutput.showResult(strikeCount,ballCount);
    Assertions.assertThat(resultCheck).isEqualTo("2스트라이크");
  }
  @Test
  @DisplayName("볼만 잘 나오는지 확인")
  void showResultTest_3(){
    int strikeCount=0;
    int ballCount=3;
    ResultOutput resultOutput = new ResultOutput();
    String resultCheck = resultOutput.showResult(strikeCount,ballCount);
    Assertions.assertThat(resultCheck).isEqualTo("3볼");
  }
  @Test
  @DisplayName("1볼 2스트라이크가 잘 나오는지 확인")
  void showResultTest_4(){
    int strikeCount=2;
    int ballCount=1;
    ResultOutput resultOutput = new ResultOutput();
    String resultCheck = resultOutput.showResult(strikeCount,ballCount);
    Assertions.assertThat(resultCheck).isEqualTo("1볼 2스트라이크");
  }

  @Test
  @DisplayName("게임을 다시 할지 묻는 메소드 테스트")
  void askToRestartOrExit(){
  //NumberComparatorTest에서의 질문 처럼 scaneer가 있으면
  // 어떻게 테스트 해야하는지를 모르겠습니다.
  }

}