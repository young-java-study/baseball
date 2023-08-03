package com.example.baseball;

public class BaseballGame {

    public int checkStrike(int[] user, int[] computer){
        int strike = 0;
        for(int i=0;i< user.length;i++){
            if(user[i]==computer[i]){
                strike++;
            }
        }
        return strike;
    }

    public int checkBall(int[] user, int[] computer){
        int ball = 0;

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

    public boolean reStart(int num){
        boolean result = true;
        if(num==2){
            result = false;
        } else if (num==1) {
            result = true;
        }
        return result;
    }

}
