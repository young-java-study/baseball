package com.example.baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user;
		RandomNumberGenerator computer = new RandomNumberGenerator();
		Judge judge = new Judge(computer.getComputerNum(), true);
		while(judge.isNotGameOver()){
			System.out.print("숫자를 입력해주세요 : ");
			String inputnum = scanner.nextLine();
			user = new User(inputnum);
			ScoreBoard scoreBoard = judge.compareNumber(user.getUserNum());
			System.out.println(showScoreBoard(scoreBoard));
			if (scoreBoard.hasThreeStrike()){
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
				String askNum = scanner.nextLine();
				judge = askForRestart(askNum);
			}
		}
	}

	private static Judge askForRestart(String askNum) {
		RandomNumberGenerator computer = new RandomNumberGenerator();
		if (RestartOption.getAfterGameNum(askNum).equals("RESTART")){
			return new Judge(computer.getComputerNum(),true);
		}
		return new Judge(computer.getComputerNum(),false);
	}

	private static StringBuilder showScoreBoard(ScoreBoard scoreBoard) {
		StringBuilder stringBuilder = new StringBuilder("");
		if (scoreBoard.isNothing()){
			stringBuilder.append("낫싱");
		}
		if (scoreBoard.getCountBall()>0){
			stringBuilder.append(scoreBoard.getCountBall()).append("볼 ");
		}
		if (scoreBoard.getCountStrike()>0){
			stringBuilder.append(scoreBoard.getCountStrike()).append("스트라이크");
		}
		return stringBuilder;
	}
}
