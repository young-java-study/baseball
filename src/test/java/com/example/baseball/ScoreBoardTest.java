package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ScoreBoardTest {
    ScoreBoard scoreBoard = new ScoreBoard(Arrays.asList(ScoreStatus.STRIKE,ScoreStatus.BALL,ScoreStatus.BALL));
    @Test
    @DisplayName("스코어보드 생성 후 스트라이크가 몇 개 인지 확인")
    void getCountStrike(){
        assertThat(scoreBoard.getCountStrike()).isEqualTo(1);
    }
    @Test
    @DisplayName("스코어보드 생성 후 볼이 몇 개 인지 확인")
    void getCountBall(){
        assertThat(scoreBoard.getCountBall()).isEqualTo(2);
    }
    @Test
    @DisplayName("스코어보드에 scorestatus가 비어있지 않을 때")
    void isNothing(){
        assertThat(scoreBoard.isNothing()).isFalse();
    }
    @Test
    @DisplayName("스코어보드에 스트라이크가 3개가 아닐 때")
    void hasThreeStrike(){
        assertThat(scoreBoard.hasThreeStrike()).isFalse();
    }
}