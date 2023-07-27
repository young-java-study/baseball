package com.example.baseball;

import java.util.Random;
import java.util.Scanner;

public class NumberInput {
  private static final int LIST_LENGTH = 3;

  public int[] getComputerNumber() {
    Random random = new Random();
    int[] computerNumber = new int[LIST_LENGTH];
    computerNumber[0] = random.nextInt(9) + 1;
    do {
      computerNumber[1] = random.nextInt(9) + 1;
    } while (computerNumber[0] == computerNumber[1]);
    do {
      computerNumber[2] = random.nextInt(9) + 1;
    } while (computerNumber[0] == computerNumber[2] || computerNumber[1] == computerNumber[2]);
    return computerNumber;
  }

  public int[] getUserNumber() {

    Scanner scanner = new Scanner(System.in);
    int[] userNumberList = new int[3];


    System.out.print("숫자를 입력해주세요 : ");
    int userNumber = scanner.nextInt();

    if (userNumber <= 100 || userNumber >= 999) {
      throw new IllegalArgumentException("3자리 숫자를 입력해주세요.");
    }
    userNumberList = numDivideList(userNumber);
    for (int i = 0; i < userNumberList.length-1; i++) {
      if (userNumberList[i] == userNumberList[i + 1]) {
        throw new IllegalArgumentException(("중복되지 않는 숫자를 입력해주세요."));
      }
    }
    if (userNumberList[0] == userNumberList[2]) {
      throw new IllegalArgumentException(("중복되지 않는 숫자를 입력해주세요."));
    }

    return userNumberList;
  }

  public int[] numDivideList(int number) {
    int[] numList = new int[LIST_LENGTH];
    for (int i = 2; i >= 0; i--) {
      numList[i] = number % 10;
      number /= 10;
    }
    return numList;
  } //받은 숫자를 배열에 정리하는 메소드
}
