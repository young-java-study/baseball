package com.example.baseball;

import java.util.Scanner;

public class User {

    public int[] getUserNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력: ");
        int userNumber = scanner.nextInt();

        int[] userNumberList = new int[3];

        userNumberList = UserNumber(userNumber);

        return userNumberList;

    }

    public int[] UserNumber(int num){
        int[] userList = new int[3];
        userList[0] = num/100;
        userList[1] = num%100/10;
        userList[2] = num%10;

        return userList;
    }
}
