package com.example.baseball;
import java.util.*;
public class Computer{	// Computer 클래스 -> 컴퓨터가 랜덤을 돌려서 정답을 생성해야 함.
    public int[] made_Computer(){ // 1부터 9까지 서로 다른 랜덤 숫자 3개를 생성하여 배열로 반환

        int count = 3; // 3개의 숫자를 생성
        int[] a = new int[count]; // 크기가 3인 정수열 배열 선언 <- 랜덤으로 생성된 숫자를 저장함.
        boolean[] usedNumbers = new boolean[10]; // 1부터 9까지의 숫자를 사용했는지를 체크하는 용도
        int numGenerated = 0; // 현재까지 생성한 랜덤 숫자의 개수

        Random d = new Random();

        // 이 과정을 numGenerated가 count와 같아질 때까지 반복하여 3개의 서로 다른 랜덤 숫자가 a 배열에 저장되도록 합니다.
        while (numGenerated < count) {
            int randomNumber = d.nextInt(9) + 1;
            if (!usedNumbers[randomNumber]) { // 생성된 랜덤 숫자가 usedNumbers 배열에서 이미 사용되었는지 확인
                a[numGenerated] = randomNumber; // 사용되지 않은 숫자라면 a 배열에 추가
                usedNumbers[randomNumber] = true; // 해당 숫자를 사용했다는 표시를 usedNumbers 배열에 true로 변경
                numGenerated++;
            }
        }
        return a;
    }

}