package com.example.baseball;

import java.util.Scanner;

public class Main {
	private static final int RESTART = 1;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		BaseBallManager manager = new BaseBallManager();
		manager.gameStart();
		User user;
		while(manager.CheckGame()){
			System.out.print("숫자를 입력해주세요 : ");
			String inputnum = scanner.nextLine();
			user = new User(inputnum);
			manager.CompareNumber(user);
			System.out.println(manager.ShowBase());
			if (manager.isSuccess()){
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
				String askNum = scanner.nextLine();
				manager.ReStartorExit(askNum);
			}
		}

	}
}
