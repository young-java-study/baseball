package com.example.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    private Random random = new Random();
    private final List<Integer> computerNum = new ArrayList<>();
    public RandomNumberGenerator(){
        int randomNum;
        while(computerNum.size()<3){
            randomNum = random.nextInt(8)+1;
            if (!computerNum.contains(randomNum)){
                computerNum.add(randomNum);
            }
        }
    }
    public List<Integer> getComputerNum() {
        return computerNum;
    }
}
