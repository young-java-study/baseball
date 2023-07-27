package com.example.baseball;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		User user = new User();
		Compare compare = new Compare();

		int[] computerNumber = computer.getComputer();
			int[] userNumber = user.getUserNumber();

			int strikeCount = compare.CompareStrike(userNumber, computerNumber);
			int ballCount = compare.CompareBall(userNumber, computerNumber);
			System.out.println(Compare.result(strikeCount, ballCount));
		}


}
