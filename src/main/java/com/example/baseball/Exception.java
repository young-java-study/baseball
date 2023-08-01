package com.example.baseball;

import java.util.Scanner;

public class Exception {
    public String checkValidInput(String userNumber) {
        try {
            if(!(userNumber.length() == 3)) {
                throw new IllegalArgumentException();
            }
            return userNumber;
        }
        catch (IllegalArgumentException e) {
            System.out.println("숫자를 3개 입력해 주세요.");
            return "";
        }
    }

    public int checkValidRestart(int userInput) {
        Scanner scanner = new Scanner(System.in);
        try {
            if(userInput != 1 && userInput != 2){
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            while (userInput != 1 && userInput != 2) {
                System.out.println("1, 2 중에 입력해주세요.");
                userInput = Integer.parseInt(scanner.nextLine());
            }
        }
        return userInput;
    }
}
