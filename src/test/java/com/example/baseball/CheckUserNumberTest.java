package com.example.baseball;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckUserNumberTest {
  @Test
  void testIsUnique(){
    String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
      CheckUserNumber checkusernumber = new CheckUserNumber(112);
    }).getMessage();
    assertThat(errorMessage).isEqualTo(ShowMessage.exceptionMessage());
  }

  @Test
  void testLowNumberExection(){
    String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
      CheckUserNumber checkusernumber = new CheckUserNumber(99);
    }).getMessage();
    assertThat(errorMessage).isEqualTo(ShowMessage.exceptionMessage());
  }

  @Test
  void testHighNumberException(){
    String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
      CheckUserNumber checkusernumber = new CheckUserNumber(1000 );
    }).getMessage();
    assertThat(errorMessage).isEqualTo(ShowMessage.exceptionMessage());
  }


}