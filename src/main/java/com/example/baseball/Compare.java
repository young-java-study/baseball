package com.example.baseball;

public class Compare {

    public int CompareBall(int[] user, int[] computer){
        int ballCount = 0;
        for(int i = 0; i< user.length-1;i++){
            for(int j =1;j< computer.length;j++) {
                if (user[i] == computer[j]) {
                    ballCount++;
                }
            }
        }
        return ballCount;
    }
    public int CompareStrike(int[] user, int[] computer){
        int strikeCount = 0;
        for(int i = 0; i<3;i++){
            if(user[i]==computer[i]) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public static String result(int ballCount, int strikeCount){
        String result = "";
        for(int i =1;i<3;i++){
            if(strikeCount==i && ballCount ==i){
               return result =  ballCount + "볼" + strikeCount + "스트라이크";
            }
        }if(strikeCount ==0 && ballCount==0){
            return result = "낫씽";
        }
        return result;
    }

}
