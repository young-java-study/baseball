package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class ManagerTest {

    @DisplayName("점수가 '낫싱'인 상태일 때 점수 배열이 {0,0}")
    @Test
    public void scoreIsNot(){
        int[] scores;
        ComputerModel computerModel = new ComputerModel(Arrays.asList("1", "2", "3"));
        scores = computerModel.checkStrikeBall("456");

        assertThat(scores).isEqualTo(new int[]{0, 0});
    }

    @DisplayName("점수가 '볼'만 있는 상태일 때 점수 배열이 {3, 0}")
    @Test
    public void scoreIsBall(){
        int[] scores;
        ComputerModel computerModel = new ComputerModel(Arrays.asList("1", "2", "3"));
        scores = computerModel.checkStrikeBall("312");

        assertThat(scores).isEqualTo(new int[]{3, 0});
    }

    @DisplayName("점수가 1볼 1스트라이크인 상태일 때 점수 배열이 {1, 1}")
    @Test
    public void scoreIsBallAndStrike(){
        int[] scores;
        ComputerModel computerModel = new ComputerModel(Arrays.asList("1", "2", "3"));
        scores = computerModel.checkStrikeBall("192");

        assertThat(scores).isEqualTo( new int[]{1, 1});
    }

    @DisplayName("점수 다 맞춘 3 스트라이크 상황일 때 점수 배열이 {3, 3}")
    @Test
    public void perfectScore(){
        int[] scores;
        ComputerModel computerModel = new ComputerModel(Arrays.asList("1", "2", "3"));
        scores = computerModel.checkStrikeBall("123");

        assertThat(scores).isEqualTo(new int[] {3, 3});
    }
}