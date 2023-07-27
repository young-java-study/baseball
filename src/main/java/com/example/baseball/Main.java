package com.example.baseball;
import java.util.Random;
import java.util.Scanner;
class Game_Start{
	// 컴퓨터가 1 ~ 9까지 서로 다른 랜덤 숫자 3개만 출력하게 함
	public static int[] random(){ // random 메서드는 컴퓨터가 1 ~ 9까지 서로 다른 랜덤 숫자 3개만 출력하게 함.
		int count = 3; // 숫자 3개 생성.
		int a[] = new int[count];
		Random d = new Random();

		// 중복이 있나 없나 확인 하는 반복문
		for(int i = 0; i < count; i ++){
			a[i] = d.nextInt(9) + 1; // a[i]에 1~9까지 숫자 저장
			for (int j = 0; j < i; j++){ // i번째 숫자와 이전 숫자들을 비교하여 중복된 숫자가 발견되면 i를 감소시켜서 중복을 없앰.
				if(a[i] == a[j]){
					i --;
				}
			}
		}
		return a;
	}

	public static int[] User(int count) {// User 메소드는 사용자(나)가 숫자를 입력하게 하고 숫자 3개를 배열로 저장함.
		int[] inputNumbers = new int[count];
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 : ");
		for (int i = 0; i < count; i++) {
			inputNumbers[i] = scanner.nextInt(); // inputNumbers 배열에 저장
		}

		scanner.close();
		return inputNumbers;
	}
}

class Game_Ing{
	public void compare(int a[], int b[]) { // 사용자가 입력한 숫자와 컴퓨터가 만든 숫자를 배열로 비교하는 메서드
		int strike = 0, ball = 0;

		do {
			for (int i = 0; i < 3; i++)
				for (int j = 0; j < 3; j++) {
					if (a[i] == b[j] && i == j)
						strike++;
					else if (i != j && a[i] == b[j])
						ball++;
				}
			System.out.printf("%d strike, %d ball", strike, ball);
		} while (strike != 3);
		System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
		// 숫자를 입력해주세요 : 5 6 1
		// 1 strike, 0 ball2 strike, 0 ball3 strike, 0 ball3개의 숫자를 모두 맞히셨습니다! 게임 종료
		// 결과가 망했다
		// 사용자가 입력한 숫자와 컴퓨터가 정한 숫자를 비교하는 코드는... 아직 완성하진 못할 것 같습니다
	}
}

class Game_Over{
	public void again() {
		System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		int select = scanner.nextInt();

		if(select == 1) {
			// 막힌 부분 -- 어떻게 처음부터 게임이 실행하도록 할 수 있을까
		}
		else {
			scanner.close();
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Game_Start game_start = new Game_Start();
		int[] computer = game_start.random();
		game_start.random();
		int[] User_numbers = game_start.User(3);
		Game_Ing game_ing = new Game_Ing();
		game_ing.compare(User_numbers, computer);
		Game_Over game_over = new Game_Over();
	}
}
