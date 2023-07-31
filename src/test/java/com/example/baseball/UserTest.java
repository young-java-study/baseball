package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    @DisplayName("숫자 3개를 입력받았을 때 userNum 리스트로 생성")
    void inputusernum(){
        User user = new User("321");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(3,2,1));
        boolean result = user.getUserNum().equals(arrayList);
        assertThat(result).isTrue();
    }
    @Test
    @DisplayName("유저 숫자가 3개 초과 입력받았을 때")
    void inputusernum_overlength(){
        String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
            User user = new User("3219");
        }).getMessage();
        assertThat(errorMessage).isEqualTo("숫자를 3개 입력해 주세요.");
    }

    @Test
    @DisplayName("유저 숫자에 중복 숫자가 존재할 때")
    void inputusernum_equalnumber(){
        String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
            User user = new User("119");
        }).getMessage();
        assertThat(errorMessage).isEqualTo("중복되지 않은 숫자를 입력해주세요.");
    }
}