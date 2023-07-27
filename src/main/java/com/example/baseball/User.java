package com.example.baseball;

import java.util.ArrayList;

public class User {
    public static final int NUMBER_LENGTH = 3;
    private ArrayList<Integer> userNum = new ArrayList<>();
    public User(String inputNum){
        String[] userary = inputNum.split("");
        for (int i = 0; i < userary.length; i++) {
            try {
                this.userNum.add(Integer.parseInt(userary[i]));
            }catch (NumberFormatException e){
                e.printStackTrace();
                throw e;
            }
        }
        WrongNum();
    }
    public void WrongNum(){
        if (userNum.size()> NUMBER_LENGTH|| userNum.size()<NUMBER_LENGTH){
            throw new IllegalArgumentException("숫자를 3개 입력해 주세요.");
        }
        if(userNum.get(0) == userNum.get(1) || userNum.get(1) == userNum.get(2) || userNum.get(2) == userNum.get(0)){
            throw new IllegalArgumentException("중복되지 않은 숫자를 입력해주세요.");
        }
    }

    public ArrayList<Integer> getUserNum() {
        return userNum;
    }
}
