package com.example.baseball;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		User user;
		BaseBallManager baseBallManager = new BaseBallManager();
		baseBallManager.play();
		while(baseBallManager.checkGame()){
			System.out.print("숫자를 입력해주세요 : ");
			String inputnum = scanner.nextLine();
			user = new User(inputnum);
			baseBallManager.compareNumber(user);
			System.out.println(baseBallManager.displayScoreboard());
			if (baseBallManager.isSuccess()){
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
				String askNum = scanner.nextLine();
				baseBallManager.reStartOption(askNum);
			}
		}
	}
}
