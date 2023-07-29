package com.example.baseball;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator {
    private Random random = new Random();
    private final ArrayList<Integer> computerNum = new ArrayList<>();
    public RandomNumberGenerator(){
        int randomNum;
        while(computerNum.size()<3){
            randomNum = random.nextInt(8)+1;
            if (!computerNum.contains(randomNum)){
                computerNum.add(randomNum);
            }
        }
    }
    //랜덤이라 어떻게 테스트 할지 몰라서 임시로 만들었습니다...
    public RandomNumberGenerator(String inputNum) {
        String[] computerary = inputNum.split("");
        for (int i = 0; i < computerary.length; i++) {
            try {
                this.computerNum.add(Integer.parseInt(computerary[i]));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                throw e;
            }
        }
    }

    public ArrayList<Integer> getComputerNum() {
        return computerNum;
    }
}
