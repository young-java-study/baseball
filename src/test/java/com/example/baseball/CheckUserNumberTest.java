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
  @DisplayName("isUnique 테스트")
  public void testIsUnique(){
    int userInputNumber = 157;
    int[] ARRAY_1={1,5,7};
    int[] ARRAY_2={7,7,8};
    CheckUserNumber checkUserNumber = new CheckUserNumber(userInputNumber);
    assertEquals(true, checkUserNumber.isUnique(ARRAY_1));
    assertEquals(false, checkUserNumber.isUnique(ARRAY_2));
  }

}