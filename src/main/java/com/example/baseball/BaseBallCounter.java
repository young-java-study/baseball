package com.example.baseball;

import java.util.ArrayList;

public class BaseBallCounter {
    private int strike;
    private int ball;
    private int base;
    ArrayList<Integer> memoryIndex;
    BaseBallCounter(){
        this.ball = 0;
        this.strike = 0;
        this.base = 0;
    }
    public void CheckBall() {
        this.ball = base-strike;
    }

    public void CheckBase(ArrayList<Integer> userNum, ArrayList<Integer> computerNum) {
        memoryIndex = new ArrayList<>();
        for (int i = 0; i < userNum.size(); i++) {
            if (userNum.contains(computerNum.get(i))){
                this.base++;
                memoryIndex.add(i);
            }
        }
    }

    public void CheckStrike(ArrayList<Integer> userNum, ArrayList<Integer> computerNum) {
        for (int i = 0; i < memoryIndex.size(); i++) {
            if (userNum.get(memoryIndex.get(i))== computerNum.get(memoryIndex.get(i))){
                this.strike++;
            }
        }
    }

    public String display() {
        if (base == 0){
            return "낫싱";
        }
        if (strike == 0){
            return ball+"볼";
        }
        if (ball == 0){
            return  strike+"스트라이크";
        }
        return ball+"볼 "+strike+"스트라이크";
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int getBase() {
        return base;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }
}
