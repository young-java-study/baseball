package com.example.baseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Computer computer = new Computer();
		User user = new User();
		BaseballGame baseballGame = new BaseballGame();
		showResult result = new showResult();

		int[] computerNumber = computer.randomNumber();
		boolean playingGame = true;
		String output = " ";

		while (playingGame) {
			while (!output.equals("3스트라이크")) {
				int input = result.getUserNumber();
				int[] userNumber = user.inputNumber(input);
				baseballGame.BaseballGame(userNumber);
				int strike = baseballGame.checkStrike(userNumber, computerNumber);
				int ball = baseballGame.checkBall(userNumber, computerNumber);
				output = result.gameResult(strike, ball);
				result.print(output);
			}

			System.out.print("정답입니다! 게임을 다시 시작하시겠습니까? (1: Yes, 2: No): ");
			Scanner scanner = new Scanner(System.in);
			int restart = scanner.nextInt();

			boolean gameAgain = baseballGame.reStart(restart);

			if (gameAgain == true) {
				computerNumber = computer.randomNumber();
			}else{
				playingGame = false;
			}
		}
	}
}
