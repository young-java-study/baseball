package com.example.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {

    public List<String> NumberInitialize() {
        Random random = new Random();
        String randomInt;
        List<String> num = new ArrayList<String>();
        for (int i = 0 ; i < 3;) {
            randomInt = Integer.toString((random.nextInt(9)+1));
            if (!num.contains(randomInt)) {
                num.add(randomInt);
                i++;
            }
        }
        return num;
    }
}
