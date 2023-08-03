package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    @DisplayName("숫자가 배열에 올바르게 들어가있으면 성공.")
    public void testDigit() {
        int userNum = 456;

        User user = new User();
        int[] userList = user.userNumber(userNum);
        int tenDigit = userList[1];
        assertEquals(5, tenDigit);

    }


}