package com.example.baseball;
import java.util.*;
public class Player{ // Player 클래스 -> 정답을 맞출 때까지 숫자를 계속 입력해야 함.

    private int[] inputPlayerNumbers; // // 사용자가 입력한 숫자들을 저장하는 배열
    public int[] madePlayer(int count) {// 사용자가 입력한 숫자를 배열로 저장하는 메서드
        inputPlayerNumbers = new int[count]; // count 매개변수에 따라 사용자로부터 입력받을 숫자 개수를 지정할 수 있음.
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요 : ");
        for (int i = 0; i < count; i++) {
            inputPlayerNumbers[i] = scanner.nextInt(); // inputPlayerNumbers 배열에 저장
        }
        return inputPlayerNumbers;
    }
}