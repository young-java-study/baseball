package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallCounterTest {
    @Test
    @DisplayName("같은 숫자가 몇개 있는지 확인")
    void CheckBase(){
        BaseBallCounter baseBallCounter = new BaseBallCounter();
        User user = new User("321");
        Computer computer = new Computer("153"); //컴퓨터 숫자는 원래 랜덤이라 어떻게 해야할지 몰라 임시로 생성자를 만들었습니다.
        baseBallCounter.CheckBase(user.getUserNum(),computer.getComputerNum());
        boolean result = baseBallCounter.getBase()==2;
        assertThat(result).isTrue();
    }
    @Test
    @DisplayName("스트라이크가 몇개인지 확인")
    void CheckStrike(){
        BaseBallCounter baseBallCounter = new BaseBallCounter();
        User user = new User("351");
        Computer computer = new Computer("153");
        baseBallCounter.CheckBase(user.getUserNum(),computer.getComputerNum());
        baseBallCounter.CheckStrike(user.getUserNum(),computer.getComputerNum());
        boolean result = baseBallCounter.getStrike()==1;
        assertThat(result).isTrue();
    }
    @Test
    @DisplayName("볼이 몇개인지 확인")
    void CheckBall(){
        BaseBallCounter baseBallCounter = new BaseBallCounter();
        User user = new User("351");
        Computer computer = new Computer("153");
        baseBallCounter.CheckBase(user.getUserNum(),computer.getComputerNum());
        baseBallCounter.CheckStrike(user.getUserNum(),computer.getComputerNum());
        baseBallCounter.CheckBall();
        boolean result = baseBallCounter.getBall()==2;
        assertThat(result).isTrue();
    }
}