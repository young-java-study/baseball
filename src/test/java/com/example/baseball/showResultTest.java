package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class showResultTest {

    @Test
    @DisplayName("스트라이크와 볼을 제대로 출력하면 성공")
    public void strikeAndBall(){
        BaseballGame game = new BaseballGame();
        showResult result = new showResult();
        String output = "";

        int[] user = {1, 2, 3};
        int[] computer = {2, 3, 0};

        int strike = game.checkStrike(user, computer);
        int ball = game.checkBall(user, computer);
        output = result.gameResult(strike, ball);
        assertEquals("2볼", output);
    }

}