package com.example.baseball;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static final int CONTINUE = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exception exception = new Exception();
		RandomNumber randomNumber = new RandomNumber();
		ComputerModel computerModel = new ComputerModel(randomNumber.NumberInitialize());
		View view = new View();

		int[] scoresArray;
		String userNumber = "";
		int gameState = CONTINUE;

		while (gameState == CONTINUE)
		{
			do {
				System.out.print("\n숫자를 입력해주세요: ");
				userNumber = exception.checkValidInput(scanner.nextLine());
			} while (!(userNumber.length() == 3));
			scoresArray = computerModel.checkStrikeBall(userNumber);
			view.printScores(scoresArray);
			if (scoresArray[1] == 3) {
				gameState = exception.checkValidRestart(Integer.parseInt(scanner.nextLine()));
				randomNumber = new RandomNumber();
				computerModel = new ComputerModel(randomNumber.NumberInitialize());
			}
		}
	}
}
