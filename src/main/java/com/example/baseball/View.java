package com.example.baseball;

public class View {

    public void printScores(int[] scores) {
        if (scores[0] == 0 && scores[1] == 0) {
            System.out.print("낫싱");
        }
        if(scores[0] > 0) {
            System.out.print(scores[0]+"볼 ");
        }
        if(scores[1] > 0) {
            System.out.print(scores[1]+"스트라이크 ");
        }
        if(scores[1] == 3) {
            System.out.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        }
    }
}
