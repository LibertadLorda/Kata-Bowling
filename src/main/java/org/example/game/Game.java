package org.example.game;

public class Game {

    private final int [] rolls = new int [21];

    private int currentRoll =0;

    private boolean strike(int index){
        return rolls[index] == 10;
    }

    private boolean spare(int index){
        return rolls[index] + rolls[index+1] == 10;
    }

    public void Roll(int pins){
        if(currentRoll <21) {
            rolls[currentRoll++] = pins;
        }
    }

    private int rollIndex(int... currentIndex) {
        int sum = 0;
        for (int i = 0; i < currentIndex.length; i++) {
            sum += rolls[currentIndex[i]];
        }
        return sum;
    }

    public int Score() {
        int score=0;
        int index=0;
        for (int i = 0; i < 10; i++) {
            score += rollIndex(index++);
            if (strike(index -1)){
                score += rollIndex(index, index + 1);
            }else {
                score += rollIndex(index++);
                if (spare(index -2)) {
                    score += rollIndex(index);
                }
            }
        }
        return score;
    }
}
