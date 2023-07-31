package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    @Test
    @DisplayName("숫자를 비교한 후 스코어보드가 잘 생성되는지 확인")
    void compareNumber(){
        Judge judge = new Judge(Arrays.asList(3,2,1),true);
        User user = new User("124");
        assertThat(judge.compareNumber(user.getUserNum()).getCountStrike()).isEqualTo(1);
    }
    @Test
    @DisplayName("인덱스에 따라 숫자를 비교했을 때 스트라이크가 볼이 잘 구분되는지 확인")
    void evaluatePitch(){
        Judge judge = new Judge(Arrays.asList(3,2,1),true);
        User user = new User("124");
        assertThat(judge.evaluatePitch(user.getUserNum(),0)).isEqualTo(ScoreStatus.BALL);
    }
}