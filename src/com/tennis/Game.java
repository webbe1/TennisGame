package com.tennis;

/**
 * Created by Eric on 3/21/2017.
 */
public class Game {
    //creates 2 players
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    //creates the score description based on how many points players have
    public String getScore() {
        if (player1.getScore() >= 3 && player2.getScore() >= 3) {
            if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
                return getLeadPlayer().getName() + " wins";
            } else if (player1.getScore() == player2.getScore()) {
                return "deuce";
            } else {
                return "advantage " + getLeadPlayer().getName();
            }
        } else {
            return player1.getScoreDescription() + ", " + player2.getScoreDescription();
        }
    }
    //returns who is winning
    public Player getLeadPlayer() {
        return (player1.getScore() > player2.getScore()) ? player1 : player2;
    }

}

