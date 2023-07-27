package com.example.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GameManagerTest {
    @Test
    @DisplayName("strike, ball test")
    void checkArrayTest() {
        int[] arr1 = {0, 1, 2};
        int[] arr2 = {3, 4, 5};
        GameManager gameManager = new GameManager();
        int result = gameManager.checkArray(arr1, arr2);
        System.out.println("Strike: " + gameManager.strike + ", Ball: " + gameManager.ball);
        System.out.println("Result is " + result);
    }
    @Test
    @DisplayName("Ball Count Test")
    void printBallStatusTest() {
        GameManager gameManager = new GameManager();
        gameManager.strike = 3;
        gameManager.ball = 1;
        gameManager.printBallStatus();
    }
}