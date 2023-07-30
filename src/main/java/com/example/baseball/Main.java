package com.example.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		User user = new User();
		BaseballGame baseballGame = new BaseballGame();

		int[] computerNumber = computer.randomNumber();
		boolean playAgain = true;

		while (playAgain) {
			String output = " ";
			while (!output.equals("3스트라이크")) {
				int[] userNumber = user.getUserNumber();
				baseballGame.BaseballGame(userNumber);
				int strike = baseballGame.checkStrike(userNumber, computerNumber);
				int ball = baseballGame.checkBall(userNumber, computerNumber);
				output = baseballGame.result(strike, ball);
				baseballGame.showResult(output);
			}

			System.out.print("게임을 다시 시작하시겠습니까? (1: Yes, 2: No): ");
			Scanner scanner = new Scanner(System.in);
			int restart = scanner.nextInt();

			playAgain = restart != 2;

			if (playAgain) {
				computerNumber = computer.randomNumber();
			}
		}
	}
}
