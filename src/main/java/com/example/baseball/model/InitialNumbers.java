package com.example.baseball.model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class InitialNumbers {
    int[] playerNumbers;
    int[] computerNumbers;

    public void initPlayerNumbers() {
        Scanner scanner = new Scanner(System.in);
        String playerNumbersString = scanner.nextLine();
        this.playerNumbers = Stream
                .of(playerNumbersString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public void initComputerNumbers() {
        Random random = new Random();
        int[] computerNumbers = new int[3];
        int ranValue;
        for (int i = 0; i < 3; ) {
            ranValue = random.nextInt(9) + 1;
            int finalRanValue = ranValue;
            boolean isExist = Arrays
                    .stream(computerNumbers)
                    .anyMatch(value -> value == finalRanValue);
            if (!isExist) {
                computerNumbers[i] = ranValue;
                i++;
            }
        }
        this.computerNumbers = computerNumbers;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public int[] getComputerNumbers() {
        return computerNumbers;
    }
}