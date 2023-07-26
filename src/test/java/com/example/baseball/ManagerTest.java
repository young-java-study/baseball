package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @DisplayName("점수가 '낫싱'인 상태일 때")
    @Test
    void scoreIsNot(){
        Manager manager = new Manager();
        manager.printScores(new int[]{0, 0});
    }

    @DisplayName("점수가 '볼'만 있는 상태일 때")
    @Test
    void scoreIsBall(){
        Manager manager = new Manager();
        manager.printScores(new int[]{1, 0});
    }

    @DisplayName("점수가 '스트라이크'만 있고 정답은 아닌 상태일 때")
    @Test
    void scoreIsStrike(){
        Manager manager = new Manager();
        manager.printScores(new int[]{0, 1});
    }

    @DisplayName("점수가 '볼'과 '스트라이크' 둘 다 있는 상태일 때")
    @Test
    void scoreIsBallandStrike(){
        Manager manager = new Manager();
        manager.printScores(new int[]{1, 1});
    }

    @DisplayName("점수가 다 맞춘 상태일 때")
    @Test
    void perfectScore(){
        Manager manager = new Manager();
        manager.printScores(new int[]{0, 3});
    }

    @DisplayName("볼이 2개일 때 볼 점수값 2를 반환")
    @Test
    void ballScore(){
        Manager manager = new Manager();
        int score = manager.checkBall("123", "234");

        assertThat(score).isEqualTo(2);
    }

    @DisplayName("볼이 2개고 스트라이크가 1일 때 점수값 배열 {2, 1} 반환")
    @Test
    void StrikeBallScore(){
        Manager manager = new Manager();
        int[] scoreArray = manager.checkStrikeBall("123", "132");

        assertThat(scoreArray).isEqualTo(new int[] {2, 1});
    }
}