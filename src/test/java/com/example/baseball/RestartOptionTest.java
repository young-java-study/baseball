package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RestartOptionTest {
    @Test
    @DisplayName("askNum에 1과 2가 아닌 숫자를 입력")
    void valiDateInput_askNum(){
        String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
            RestartOption.getAfterGameNum("3");
        }).getMessage();
        assertThat(errorMessage).isEqualTo("1과 2만 입력해주세요");
    }

}