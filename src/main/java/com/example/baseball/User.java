package com.example.baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class User {
    private static final int NUMBER_LENGTH = 3;
    private final ArrayList<Integer> userNum = new ArrayList<>();
    public User(String inputNum){
        String[] userary = inputNum.split("");
        valiDateInput(userary);
        for (int i = 0; i < userary.length; i++) {
            try {
                this.userNum.add(Integer.parseInt(userary[i]));
            }catch (NumberFormatException e){
                e.printStackTrace();
                throw e;
            }
        }
    }
    private void valiDateInput(String[] userary){
        HashSet<String> set = new HashSet<String>();
        set.addAll(List.of(userary));
        if (userary.length> NUMBER_LENGTH|| userary.length<NUMBER_LENGTH){
            throw new IllegalArgumentException("숫자를 3개 입력해 주세요.");
        }
        if (set.size()<NUMBER_LENGTH){
            throw new IllegalArgumentException("중복되지 않은 숫자를 입력해주세요.");
        }
    }

    public ArrayList<Integer> getUserNum() {
        return userNum;
    }
}
