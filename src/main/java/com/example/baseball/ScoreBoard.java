package com.example.baseball;

public class ScoreBoard {
    private static final int MAX_STRIKE = 3;
    private final int base;
    private final int ball;
    private final int strike;
    private StringBuilder scoreboard;
    public ScoreBoard(int base, int ball, int strike) {
        this.base = base;
        this.ball = ball;
        this.strike = strike;
    }
    public StringBuilder showScore(){
        scoreboard = new StringBuilder("");
        if (ball != 0){
            scoreboard.append(this.ball).append("볼 ");
        }
        if (strike != 0){
            scoreboard.append(this.strike).append("스트라이크");
        }
        if (base == 0){
            scoreboard.append("낫싱");
        }
        return scoreboard;
    }
    public boolean hasThreeStrike(){
        if (this.strike==MAX_STRIKE){
            return true;
        }
        return false;
    }
}
