package com.example.baseball;

import static com.example.baseball.Main._CONTINUE;


public class GameManager {
    InitNum initNum = new InitNum();
    int strike, ball;

    int checkArray(int[] computer, int[] player) {
        strike = 0;
        ball = 0;
        //볼, 스트라이크 확인, 뎁스 3 → 2 로 수정해야 함
        for (int i = 0; i < 3; i++) {
            if (computer[i] == player[i]) {
                strike++;
                continue;
            }
            for (int j = 0; j < 3; j++) {
                if (computer[i] == player[j]) {
                    ball++;
                }
            }
        }
        if (strike == 3) { // 두 배열에 대해 eqauls로 해도되나 이미 연산을 마쳤기 때문에
            System.out.println("3 스트라이크!"); // 카운트는 올라가나 42번줄 시행 X, printBallStatus() 가 실행되지 않음
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return initNum.setStatus(); //scanNumber에서 게임을 계속할지 말지를 판단
        }
        return _CONTINUE; // 3스트라이크가 아니면 계속 진행
    }

    void printBallStatus() {
        if (strike == 0 && ball == 0) {
            System.out.println("나씽");
        }
        if (strike > 0 && ball == 0) { // 3 Strike 일 때 이 코드는 작동 X, line27 에서 하드코딩
            System.out.println(strike + " 스트라이크!");
        }
        if (strike == 0 && ball > 0) {
            System.out.println(ball + " 볼!");
        }
        if (strike > 0 && ball > 0) {
            System.out.println(strike + " 스트라이크!, " + ball + " 볼!");
        }
    }
}
