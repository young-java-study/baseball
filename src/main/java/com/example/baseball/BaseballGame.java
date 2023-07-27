package com.example.baseball;

public class BaseballGame {
        private int ball;
        private int strike;

    private final int[] userNum = new int[3];

    public int checkStrike(int[] user, int[] computer){
        strike = 0;
        for(int i=0;i< user.length;i++){
            if(user[i]==computer[i]){
                strike++;
            }
        }
        return strike;
    }

    public int checkBall(int[] user, int[] computer){
        ball = 0;
       if (user[0] == computer[1] || user[0] == computer[2]){
           ball++;
       }
       if (user[1] == computer[0] || user[1] == computer[2]){
            ball++;
       }
       if(user[2] == computer[0] || user[2] == computer[1]){
           ball++;
       }
        return ball;
    }
    public void BaseballGame(int[] user) {
        if(user.length>3) {
            System.out.print("3자리수 숫자만 입력해주세요.");
        }else if(user[0] == user[1] || user[1]==user[2] || user[0]==user[2]){
            System.out.print("중복된 숫자입니다.");
        }

    }

    public String result(int strikeCount, int ballCount){
        String gameResult = "" ;
        if(strikeCount!=0 && ballCount ==0){
            gameResult = strikeCount + "스트라이크";
        } else if (strikeCount==0 && ballCount!=0) {
            gameResult = ballCount + "볼";
        } else if(strikeCount!=0 && ballCount!=0){
            gameResult = strikeCount + "스트라이크" + ballCount + "볼";
        } else if(strikeCount==0 && ballCount==0){
            gameResult = "낫씽";
        }

        return gameResult;
    }

    public void showResult(String result){
        System.out.println(result);
    }

}
