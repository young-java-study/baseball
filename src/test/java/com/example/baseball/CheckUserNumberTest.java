package com.example.baseball;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CheckUserNumberTest {
  @Test
  @DisplayName("splitNumbersToArray 테스트")
  public void testSplitNumbersToArray(){
    int userInputNumber = 157;
    int[] ARRAY={1,5,7};
    CheckUserNumber checkUserNumber = new CheckUserNumber(userInputNumber);
    assertArrayEquals(ARRAY, checkUserNumber.getUserNumber());
  }


  @Test
  @DisplayName("inUnique 테스트")
  public void testIsUnique(){
    int userInputNumber = 157;
    int[] ARRAY_1={1,5,7};
    int[] ARRAY_2={7,7,8};
    CheckUserNumber checkUserNumber = new CheckUserNumber(userInputNumber);
//여기 테스트코드 작성하면서 어? 나는 이 메소드 확인만 하면 되는데 userInput이 꼭 필요하네?라고 생각해 의문점을 가짐

    assertEquals(true, checkUserNumber.isUnique(ARRAY_1));
    assertEquals(false, checkUserNumber.isUnique(ARRAY_2));
  }

}