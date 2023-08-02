package com.example.baseball.controller;

import com.example.baseball.model.ComparisonNumbers;
import com.example.baseball.model.InitialNumbers;
import com.example.baseball.view.PitchInformation;
import com.example.baseball.view.RequestNumbers;

import java.util.Scanner;


public class GameController {
    public static final int _CONTINUE = 1;
    private int condition = _CONTINUE;

    public void playTheGame() {
        InitialNumbers initialNumbers = new InitialNumbers();
        initialNumbers.initComputerNumbers();

        do {
            RequestNumbers requestNumbers = new RequestNumbers();
            requestNumbers.requestNumbers();

            initialNumbers.initPlayerNumbers();

            ComparisonNumbers comparisonNumbers = new ComparisonNumbers(
                    initialNumbers.getPlayerNumbers(),
                    initialNumbers.getComputerNumbers()
            );

            comparisonNumbers.compareNumbers();

            PitchInformation gameView = new PitchInformation(
                    comparisonNumbers.getStrike(),
                    comparisonNumbers.getBall()
            );

            gameView.notifyPitchInformation();

            if (comparisonNumbers.getStrike() == 3) {
                resetGameCondition();
                initialNumbers.initComputerNumbers();
            }
        } while (condition == _CONTINUE);
    }

    public void resetGameCondition() { // 상태를 가지지 않으므로 Model 로 분리하지 않음
        Scanner scanner = new Scanner(System.in);

        try {
            condition = scanner.nextInt();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}