package com.example.baseball;

import java.util.Arrays;

public enum AfterGame {
    RESTART("1","RESTART"),
    EXIT("2","EXIT");

    private final String afterGameNum;
    private final String gameState;
    AfterGame(String afterGameNum, String gameState){
        this.afterGameNum = afterGameNum;
        this.gameState = gameState;
    }
    public static String getAfterGameNum(String askNum){
        return getAfterGame(askNum).gameState;
    }
    private static AfterGame getAfterGame(String askNum){
        return Arrays.stream(values())
                .filter(o->o.afterGameNum.equals(askNum))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("1과 2만 입력해주세요"));
    }
}
