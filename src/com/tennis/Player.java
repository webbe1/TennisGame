package com.tennis;

import java.util.Arrays;;
import java.util.List;
/**
 * Created by Eric on 3/21/2017.
 */
public class Player {
    //list containing the special point names
    public static final List<String> pointNames = Arrays.asList("love", "fifteen", "thirty", "forty");
    //returns the given name
    String name;
    public String getName() {
        return name;
    }
    //int for the score of the players
    private int score;
    public int getScore() {
        return score;
    }

    //marks who won the serve
    public void pointEarned() {
        this.score = this.score + 1;
    }
    //string for player name
    public Player(String name) {
        this.name = name;
    }
    //returns special score names
    public String getScoreDescription(){
        return pointNames.get(score);
    }
}
