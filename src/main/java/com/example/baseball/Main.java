package com.example.baseball;
import java.util.*;
public class Main {
	public static void main(String[] args) {

		int select = 0; // 사용자가 게임을 반복할지 종료할지를 선택하는 변수
		Scanner scanner = new Scanner(System.in);

		do { // 사용자가 게임을 반복할지 종료할지를 선택할 수 있도록 do while 루프를 사용
			Computer computer = new Computer();
			Player player = new Player();
			Manager manager = new Manager();

			int[] endComputerAnswer = computer.madeComputer();
			boolean isCorrect = false; // 사용자가 모든 숫자를 맞췄는지를 나타내는 변수

			while (!isCorrect) { // 사용자가 정답을 맞출 때까지 반복함
				int[] endPlayerAnswer = player.madePlayer(endComputerAnswer.length);
				isCorrect = Manager.compare(endComputerAnswer, endPlayerAnswer);
			}

			System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
			select = scanner.nextInt();

		} while (select == 1);
		scanner.close();
	}
}
