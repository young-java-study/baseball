package com.example.baseball;

import java.util.Random;


public class Manager {

    String setRandomComputerNumber() {
        Random random = new Random();
        String num = "";
        String randomInt;
        for (int i = 0 ; i < 3; ) {
            randomInt = Integer.toString((random.nextInt(9)+1));
            if (!num.contains(randomInt)) {
                num += randomInt;
                i++;
            }
        }
        return num;
    }

    int[] checkStrikeBall(String userNumber, String computerNumber) {
        int cnt = 0, i = 0, strikeCounter = 0;

        while(i < 3) {
            if (Integer.toString(userNumber.charAt(cnt)).equals(Integer.toString(computerNumber.charAt(cnt)))) {
                strikeCounter++;
                userNumber = userNumber.replace(String.valueOf(computerNumber.charAt(cnt)), "");
                computerNumber = computerNumber.replace(String.valueOf(computerNumber.charAt(cnt)), "");
                cnt--;
            }
            i++;
            cnt++;
        }
        return new int[] {checkBall(userNumber, computerNumber), strikeCounter};
    }

    int checkBall(String userNumber, String computerNumber) {
        int ballCounter = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            if (userNumber.contains(String.valueOf(computerNumber.charAt(i)))) {
                ballCounter++;
            }
        }
        return ballCounter;
    }

    boolean printScores(int[] scores) {
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
            return true;
        }
        return false;
    }
}