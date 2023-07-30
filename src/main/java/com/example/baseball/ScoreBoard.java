package com.example.baseball;

import java.util.List;
public class ScoreBoard {
    private static final int MAX_STRIKE = 3;
    private final List<ScoreStatus> scoreStatuses;
    public ScoreBoard(List<ScoreStatus> scoreStatuses){
        this.scoreStatuses = scoreStatuses;
    }
    public int getCountStrike(){
        return (int) scoreStatuses.stream()
                .filter(status -> status == ScoreStatus.STRIKE)
                .count();


    }
    public int getCountBall(){
        return (int) scoreStatuses.stream()
                .filter(status -> status == ScoreStatus.BALL)
                .count();
    }
    public boolean isNothing(){
        if (scoreStatuses.size()==0){
            return true;
        }
        return false;
    }
    public boolean hasThreeStrike(){
        return getCountStrike() == MAX_STRIKE;
    }
}
