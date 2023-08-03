package com.example.baseball;

import java.util.Scanner;

public class User {

    public int[] inputNumber(int userNumber){
        int[] userNumberList = new int[3];
        userNumberList = userNumber(userNumber);
        return userNumberList;
    }

    public int[] userNumber(int num){
        int[] userList = new int[3];
        userList[0] = num/100;
        userList[1] = num%100/10;
        userList[2] = num%10;

        return userList;
    }
}
