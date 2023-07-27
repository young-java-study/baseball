package com.example.baseball;

public class Main {
	final static int _CONTINUE = 0;
	final static int _RESTART = 1;
	final static int _STOP = 2;

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		InitNum initNum = new InitNum();

		int[] playerNum;
		int[] computerNum = initNum.initializeRandomNum();
		//컴퓨터 숫자는 반복되지 않으므로 반복문 진입 전 초기화

		int gameStatus;
		do {
			playerNum = initNum.initializeScanNum();
			gameStatus = gameManager.checkArray(computerNum, playerNum);
			if (gameStatus == _RESTART) {
				computerNum = initNum.initializeRandomNum();
				gameStatus = _CONTINUE; // 재설정, 반복문 조건 충족
				continue; // printBallStatus 를 거치기 않기 위함, 출력문은 컨디션 확인의 후순임
			}
			if (gameStatus == _STOP) {
				break;
			}
			gameManager.printBallStatus(); //스트라이크, 볼
		} while (gameStatus == _CONTINUE);
	}
}