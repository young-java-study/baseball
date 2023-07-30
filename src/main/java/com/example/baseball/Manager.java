package com.example.baseball;
public class Manager{ // Manager 클래스 -> 게임 진행 상태를 판단
    public static boolean compare(int[] computer_answer, int[] player_answer) {
        // 사용자가 입력한 숫자와 컴퓨터가 만든 숫자를 배열로 비교하여 스트라이크와 볼의 개수를 계산
        // 스트라이크와 볼의 개수를 계산하고 출력한 후, 사용자가 모든 숫자를 맞췄는지 여부를 반환

        int strike = 0;
        int ball = 0;

        for(int i = 0; i < computer_answer.length; i++) {
            if(computer_answer[i] == player_answer[i]) {    //스트라이크 체크
                strike++;
            }
            for(int j = 0; j < computer_answer.length; j++) {    //볼 체크
                if(computer_answer[i]== player_answer[j] && i!=j) {
                    ball++;
                    break;
                }
            }
        }
        System.out.println(strike + " 스트라이크, " + ball + " 볼");

        return strike == computer_answer.length;
    }
}