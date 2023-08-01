package com.example.baseball;

import java.util.ArrayList;
import java.util.List;

public class ComputerModel {

    private final List<String> values;

    public ComputerModel(List<String> values) {
        this.values = values;
    }

    public List<String> getNumList() {
        return values;
    }

    public int[] checkStrikeBall(String userNumber) {
        int cnt = 0, i = 0, strikeCounter = 0;
        List<String> value = new ArrayList<>(this.values);


        while(i < 3) {
            if (value.get(cnt).equals(String.valueOf(userNumber.charAt(cnt)))) {
                strikeCounter++;
                value.remove(cnt);
                userNumber = userNumber.replace(String.valueOf(userNumber.charAt(cnt)), "");
                cnt--;
            }
            i++;
            cnt++;
        }
        return new int[] {checkBall(userNumber, value), strikeCounter};
    }

    private int checkBall(String userNumber, List<String> computerNumber) {
        int ballCounter = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            if (computerNumber.contains(String.valueOf(userNumber.charAt(i)))) {
                ballCounter++;
            }
        }
        return ballCounter;
    }

}
