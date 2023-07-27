package com.example.baseball;

public class Main {


	public static void main(String[] args) {
		NumberInput numberInput = new NumberInput();
		NumberComparator numberComparator = new NumberComparator();
		ResultOutput resultOutput = new ResultOutput();
		boolean isGameOver = true;
		while (isGameOver){
			int[] computerNumber = numberInput.getComputerNumber();
			String result = "";
			while (!result.equals("3스트라이크")){
				for (int i = 0; i < computerNumber.length; i++) {
					System.out.print(computerNumber[i]);
				}
				int[] userNumber = numberInput.getUserNumber();
				int strikeCount = numberComparator.strikeCount(computerNumber,userNumber);
				int ballCount = numberComparator.ballCount(computerNumber,userNumber);
				System.out.println(resultOutput.showResult(strikeCount, ballCount));
				result= resultOutput.showResult(strikeCount,ballCount);
			}
			isGameOver = resultOutput.askToRestartOrExit();
		}
	}
}
