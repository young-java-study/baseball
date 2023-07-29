package com.example.baseball;

import java.util.ArrayList;

public class BaseBallCounter {
    private int base;
    private int strike;
    private int ball;
    private ArrayList<Integer> memoryindex;
    public BaseBallCounter(){

    }

    public int getBaseCount(ArrayList<Integer> userNum, ArrayList<Integer> computerNum) {
        memoryindex = new ArrayList<>();
        for (int i = 0; i < userNum.size(); i++) {
            if (userNum.contains(computerNum.get(i))){
                this.base++;
                memoryindex.add(i);
            }
        }
        return base;
    }

    public int getStrikeCount(ArrayList<Integer> userNum, ArrayList<Integer> computerNum) {
        for (int i = 0; i < memoryindex.size(); i++) {
            if (userNum.get(memoryindex.get(i))== computerNum.get(memoryindex.get(i))){
                this.strike++;
            }
        }
        return strike;
    }
    public int getBallCount(){
        ball = base - strike;
        return ball;
    }
}
