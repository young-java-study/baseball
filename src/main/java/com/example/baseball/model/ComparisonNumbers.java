package com.example.baseball.model;

public class ComparisonNumbers {
    private int ball;
    private int strike;
    int[] playerNumbers;
    int[] computerNumbers;
    public ComparisonNumbers (int[] playerNumbers, int[] computerNumbers){
        this.playerNumbers = playerNumbers;
        this.computerNumbers = computerNumbers;
    }
    public void compareNumbers() {
        //볼, 스트라이크 확인, 뎁스 3 → 2 로 수정해야 함
        for (int i = 0; i < 3; i++) {
            if (computerNumbers[i] == playerNumbers[i]) {
                strike++;
                continue;
            }
            for (int j = 0; j < 3; j++) {
                if (computerNumbers[i] == playerNumbers[j]) {
                    ball++;
                }
            }
        }
    }
    public int getBall() {
        return this.ball;
    }

    public int getStrike() {
        return this.strike;
    }

}