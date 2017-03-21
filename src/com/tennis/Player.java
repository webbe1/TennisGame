package com.tennis;

import java.util.Arrays;;
import java.util.List;
/**
 * Created by Eric on 3/21/2017.
 */
public class Player {

    public static final List<String> pointNames = Arrays.asList("love", "fifteen", "thirty", "forty");

    String name;
    public String getName() {
        return name;
    }
    private int score;
    public int getScore() {
        return score;
    }


    public void winBall() {
        this.score = this.score + 1;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getScoreDescription(){
        return pointNames.get(score);
    }
}
