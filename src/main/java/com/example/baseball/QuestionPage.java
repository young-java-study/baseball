// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.
// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.
// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.

// line 21 ~ 27 확인해주시면 감사하겠습니다.

package com.example.baseball;
import java.util.Scanner;

public class QuestionPage {
    Scanner scanner = new Scanner(System.in);

    //InitNum.initializeScanNum 코드와 유사한 내용입니다.
    int[] initializeScanNum() { //입력받은 숫자로 배열초기화
        System.out.print("input number: ");
        int[] scanNum = new int[3];
        for (int i = 0; i < 3; i++) {
            try {
                scanNum[i] = scanner.nextInt();
            } catch (IllegalArgumentException e) { // 작동 X
/*
Integer 가 아닌 Character, String 형태로 들어올 때 오류발생 의도
예, 1 2 3 입력이 아닌 A B C 로 입력하였을 때,
"정수형을 입력해주세요!" 을 의도하였으나 프로그램 종료
InputMismatchException 을 대신 입력해보았으나 동일증상 발생

원래 위치인 InitNum 클래스에선 String 형태로 한번에 받아와 3번 쪼개는 형태
해당 코드는 Scanner 를 3번 사용해서 문제가 발생되는 것인가요?
*/
                System.out.println("정수형을 입력해주세요!");
            }
        }
        return scanNum;
    }
}

// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.
// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.
// 이 페이지는 실제 사용되는 코드가 아니라 질문을 드리기 위해 만든 페이지입니다.