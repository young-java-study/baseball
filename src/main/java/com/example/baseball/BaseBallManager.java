package com.example.baseball;

public class BaseBallManager {
    private RandomNumberGenerator computer;
    private Judge judge;
    private ScoreBoard scoreBoard;
    private boolean result;
    public boolean checkGame(){
        return result;
    }
    public void play(){
        computer = new RandomNumberGenerator();
        result = true;
    }
    public void compareNumber(User user) {
        judge = new Judge(user.getUserNum(),computer.getComputerNum());
        scoreBoard = judge.compareNumber();
    }
    public StringBuilder displayScoreboard(){
        return scoreBoard.showScore();
    }
    public boolean isSuccess(){
        if (scoreBoard.hasThreeStrike()){
            return true;
        }
        return false;
    }
    public void reStartOption(String askNum){
        if (RestartOption.getAfterGameNum(askNum).equals("RESTART")){
            play();
        }
        if (RestartOption.getAfterGameNum(askNum).equals("EXIT")){
            result = false;
        }
    }
}
