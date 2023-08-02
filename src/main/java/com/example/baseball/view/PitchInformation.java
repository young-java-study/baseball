package com.example.baseball.view;

public class PitchInformation {
    int strike;
    int ball;
    public PitchInformation(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void notifyPitchInformation() {
        if (strike > 0 && ball > 0) {
                System.out.println(ball + "볼" + strike + "스트라이크");
            }
            if (strike == 0 && ball > 0) {
                System.out.println(ball + "볼");
            }
            if (strike > 0 && ball == 0) {
                System.out.println(strike + "스트라이크");
            }
            if (strike == 0 && ball== 0) {
                System.out.println("낫싱");
            }
            if (strike == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        }
    }
}