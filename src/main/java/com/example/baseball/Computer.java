package com.example.baseball;

import java.util.Random;

public class Computer {

    private static final int LIST_LENGTH = 3;
    public void duplicateNumber(int[] randomNumber){
        if(randomNumber[0] == randomNumber[1]){
            randomNumber();
        }if (randomNumber[1] == randomNumber[2]) {
            randomNumber();
        }if(randomNumber[0] == randomNumber[2]){
            randomNumber();
        }
    }

    public int[] randomNumber(){
        Random random = new Random();
        int[] computerNumber = new int[LIST_LENGTH];
        for(int i =0; i<computerNumber.length;i++){
            computerNumber[i] = random.nextInt(9)+1;
        }
        duplicateNumber(computerNumber);
        return computerNumber;
    }

}
