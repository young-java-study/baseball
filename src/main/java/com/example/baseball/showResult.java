package com.example.baseball;

import java.util.Scanner;

public class showResult {

    public int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int userNumber = scanner.nextInt();

        return userNumber;
    }

    public String gameResult(int strikeCount, int ballCount){
        String result = "";
        if(strikeCount!=0 && ballCount ==0){
            result = strikeCount+"스트라이크";
        } else if (strikeCount==0 && ballCount!=0) {
           result = ballCount+"볼";
        } else if(strikeCount!=0 && ballCount!=0){
            result = strikeCount+"스트라이크" + ballCount + "볼";
        } else if(strikeCount==0 && ballCount==0){
            result = "낫씽";
        }

        return result;
    }

    public void print(String result){
        System.out.println(result);
    }

    public boolean threeStrike(int strike){
        boolean out = true;
        if(strike==3){
            out = false;
        }
        return out;
    }

}
