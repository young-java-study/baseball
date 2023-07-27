package com.example.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberInputTest {
  @Test
  @DisplayName("컴퓨터가 정답을 잘 가져오는지 확인")
  void getComputerNumberTest(){
    //컴퓨터가 랜덤인 숫자를 가져오는데 그거를 제가 정한숫자와 같은지
    //확인을 어떻게 하는지 모르겠습니다.
  }

  @Test
  @DisplayName("사용자의 정답을 잘 가져오는지 확인")
  void getUserNumberTest(){
    //getUserNumber메소드에서 scanner를 사용하여 사용자에게 입력을 받는데
    //여기서 getUserNumber메소드를 호출해서 사용하면 여기서도 입력을 받게 됩니다.
    //이 부분을 어떻게 해야할지 모르겠습니다
    // ex)원래 메소드에서 scanner를 지우는 등의 수정을 해야하는지?
    NumberInput numberInput = new NumberInput();
    //int getUserNumber = numberInput.getUserNumber()
  }
  @Test
  @DisplayName("숫자를 배열에 잘 저장한는지 확인")
  void numDivideListTest_1(){
    NumberInput numberInput = new NumberInput();
    int[] number = numberInput.numDivideList(123);
    int[] numberCheck={1,2,3};
    Assertions.assertThat(number).isEqualTo(numberCheck);
  }

  @Test
  @DisplayName("숫자를 배열에 잘 저장한는지 확인")
  void numDivideListTest_2(){
    NumberInput numberInput = new NumberInput();
    int[] number = numberInput.numDivideList(1234);
    int[] numberCheck={1,2,3,4};
    Assertions.assertThat(number).isEqualTo(numberCheck);
  }
  //이와 같은 경우에는 오류가 발생하는데 왜냐하면 NumberInput 클래스에서
  //매직넘버를 사용하여 배열의 길이에 제한을 두었는데 이 부분을 수정해야 하는지
  //아니면 제가 입력받는 메소드(getUserNumber())를 보면
  // 예외 처리를 해서 이 test가 필요 없는 것인지 궁금합니다.
}