package com.example.baseball;

import java.util.Random;
import java.util.Scanner;

import static com.example.baseball.Main._RESTART;

public class InitNum {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int[] initializeScanNum() {
        System.out.print("숫자 입력: ");
        String scanNumStr = scanner.nextLine();
        String[] scanNumStrs = scanNumStr.split(" ");
        int[] scanNum = new int[3];

        for (int i = 0; i < 3; i++) {
            try {
                scanNum[i] = Integer.parseInt(scanNumStrs[i]);
            } catch (IllegalArgumentException e) { // 잘못된 인자 전달 시, String, Char 형 등
                System.out.println("정수형을 입력해주세요!"); // 메세지 출력 후 그냥 종료
                break;
            }
        }
        return scanNum;
    }

    int[] initializeRandomNum() { // 무작위 값 숫자로 배열초기화
        int[] randomNum = new int[3];
        String randomNumStr = "";

        for (int i = 0; i < 3; ) { // i++가 없으므로 해당 숫자에 계속 갇혀있음
            randomNum[i] = random.nextInt(9) + 1; // 1~9 에 대한 수
            String number = Integer.toString(randomNum[i]); // 받아들인 배열은 String 형으로 바꿈

            if (randomNumStr.contains(number)) {
                continue;
            }
            randomNumStr += randomNum[i]; //else 문과 동일
            i++; // 조건 충족 시 i++ 를 수행해 다음 index 번호 수행
        }
        return randomNum;
    }

    int setStatus() {
        String inputNumStr = scanner.nextLine();
        int inputNum;

        try { // 다른 자료형이 들어오면 프로그램 재실행으로 인식, 예외처리를 확인하기 위함
            inputNum = Integer.parseInt(inputNumStr);
        } catch (IllegalArgumentException e) {
            inputNum = _RESTART;
        }
        return inputNum;
    }
}
