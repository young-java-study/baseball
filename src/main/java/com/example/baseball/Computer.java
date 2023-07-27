package com.example.baseball;

import java.util.Random;

public class Computer {

    private static final int LIST_LENGTH = 3;
    public int[] getComputer() {
        Random random = new Random();
        int[] computerNum = new int[LIST_LENGTH];
        computerNum[0] = random.nextInt(9) + 1;
        computerNum[1] = random.nextInt(9) + 1;
        computerNum[2] = random.nextInt(9) + 1;

        if (computerNum[0] == computerNum[1] || computerNum[1] == computerNum[2] || computerNum[0] == computerNum[2]) {
            return getComputer();
        } else {
            return computerNum;
        }
    }


}
