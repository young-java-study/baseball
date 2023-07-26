package com.example.baseball;

import java.util.Objects;
import java.util.Scanner;

public class Main {

	public static final int CONTINUE = 1;


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Manager manager = new Manager();

		int[] scores;
		String computerNumber = "";
		String userNumber = "";
		int gameState = CONTINUE;
		computerNumber = manager.setRandomComputerNumber();

		while (gameState == CONTINUE)
		{
			System.out.print("\n숫자를 입력해주세요: ");
			userNumber = scanner.nextLine();
			try {
				scores = manager.checkStrikeBall(userNumber, computerNumber);
			} catch (IllegalArgumentException e) {
				System.out.print("\n숫자를 다시 입력해주세요: ");
				userNumber = scanner.nextLine();
				scores = manager.checkStrikeBall(userNumber, computerNumber);
			}
			if(manager.printScores(scores)) {
				gameState =  scanner.nextInt();
				computerNumber = manager.setRandomComputerNumber();
			}
		}
	}
}
