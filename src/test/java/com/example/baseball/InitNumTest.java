package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InitNumTest {
    @Test
    @DisplayName("scan init test")
    void initScanNumTest() { // Scanner 가 입력이 안됩니다.
        // JUnit5 테스트 클래스에서 함수 호출 시 해당 함수 내 Scanner 사용 불가능?
        // 아니면 모든 자료형, 입력값(예외처리)에 대해 JUnit5 가 검사를 하는 것인지?
        // No line found
        // java.util.NoSuchElementException: No line found 를 보고 추측
        int[] testArray;
        InitNum initNum = new InitNum();
        testArray = initNum.initializeScanNum();

        for (int idx : testArray) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }

    @Test
    @DisplayName("random init test")
    void initRandomNumTest() {
        int[] testArray;
        InitNum initNum = new InitNum();
        testArray = initNum.initializeRandomNum();

        for (int idx : testArray) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }

    @Test
    @DisplayName("set status test")
    void setStatusTest() {

    }
}