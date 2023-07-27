package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallManagerTest {
    @Test
    @DisplayName("게임 재시작 할 때 1과 2가 아닌 문자가 입력된 경우")
    void ReStartorExit_Not_OneOrTwo(){
        BaseBallManager manager = new BaseBallManager();
        String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
            manager.ReStartorExit("3");
        }).getMessage();
        assertThat(errorMessage).isEqualTo("1과 2만 입력해주세요");
    }
}