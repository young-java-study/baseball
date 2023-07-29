package com.example.baseball;

import java.util.ArrayList;

public class Judge {
    private final ArrayList<Integer> userNum;
    private final ArrayList<Integer> computerNum;

    public Judge( ArrayList<Integer> userNum, ArrayList<Integer> computerNum) {
        this.userNum = userNum;
        this.computerNum = computerNum;
    }
    public ScoreBoard compareNumber(){
        BaseBallCounter baseBallCounter = new BaseBallCounter();
        int base = baseBallCounter.getBaseCount(userNum,computerNum);
        int strike = baseBallCounter.getStrikeCount(userNum,computerNum);
        int ball = baseBallCounter.getBallCount();
        return new ScoreBoard(base,strike,ball);
    }

}
