package com.example.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Judge {
    private static final int NUMBER_LENGTH = 3;
    private final Map<Integer,Integer> computerNumMap;
    private final boolean checkgame;
    public Judge(List<Integer> computerNum, boolean checkgame) {
        computerNumMap = IntStream.range(0,computerNum.size())
                .boxed()
                .collect(Collectors.toMap(index -> index, computerNum::get));

        this.checkgame = checkgame;
    }
    public ScoreBoard compareNumber(List<Integer> userNum){
        List<ScoreStatus> scoreStatuses = new ArrayList<>();
        for (int i = 0; i < computerNumMap.size(); i++) {
           ScoreStatus scoreStatus = evaluatePitch(userNum,i);
           if (!scoreStatus.equals(ScoreStatus.NOTHING)){
               scoreStatuses.add(scoreStatus);
           }
        }
        return new ScoreBoard(scoreStatuses);
    }
    public ScoreStatus evaluatePitch(List<Integer> userNum, int index){
        if (computerNumMap.get(index)==userNum.get(index)){
            return ScoreStatus.STRIKE;
        }
        if (computerNumMap.containsValue(userNum.get(index))){
            return ScoreStatus.BALL;
        }
       return ScoreStatus.NOTHING;
    }

    public boolean isNotGameOver() {
        return checkgame;
    }
}
