package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    @Test
    @DisplayName("스트라이크를 잘 구현해내면 성공.")
    public void testStrike() {
        int[] user = {1, 2, 3};
        int[] computer = {1, 4, 3};

        BaseballGame strike = new BaseballGame();
        int strikeCount = strike.checkStrike(user, computer);
        assertEquals(2, strikeCount);
    }

    @Test
    @DisplayName("볼을 잘 구현해내면 성공.")
    public void testBall() {
        int[] user = {5, 6, 7};
        int[] computer = {6, 7, 5};

        BaseballGame ball = new BaseballGame();
        int ballCount = ball.checkBall(user, computer);
        assertEquals(3, ballCount);
    }

}