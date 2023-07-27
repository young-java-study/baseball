package com.example.baseball;

public class BaseBallManager {
    public static final int NUMBER_LENGTH = 3;
    public Computer computer;
    BaseBallCounter baseBallCounter;
    boolean result;
    public boolean CheckGame(){
        return result;
    }

    public void gameStart() {
        computer = new Computer();
        result = true;
    }

    public void CompareNumber(User user) {
        baseBallCounter = new BaseBallCounter();
        baseBallCounter.CheckBase(user.getUserNum(),computer.getComputerNum());
        baseBallCounter.CheckStrike(user.getUserNum(),computer.getComputerNum());
        baseBallCounter.CheckBall();
    }

    public String ShowBase() {
        return baseBallCounter.display();
    }

    public boolean isSuccess() {
        if (baseBallCounter.getStrike() == 3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }

    public void ReStartorExit(String askNum) {
        if (AfterGame.getAfterGameNum(askNum).equals("RESTART")){
            gameStart();
        }
        if (AfterGame.getAfterGameNum(askNum).equals("EXIT")){
            result = false;
        }
    }
}
