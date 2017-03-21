package com.tennis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Eric on 3/21/2017.
 */
public class TestGame {

    Player james;
    Player frank;
    Game game;

    @Before
    public void beforeGameTest() {
        james = new Player("James");
        frank = new Player("Frank");
        game = new Game(james, frank);
    }

    @Test
    public void lovequals0() {
        Game game = new Game(james, frank);
        assertEquals(game.getScore(),  "love, love");
    }

    @Test
    public void fifteenequals1() {
        frank.pointEarned();
        assertEquals(game.getScore(), "love, fifteen");
    }

    @Test
    public void thirtyequals2() {
        james.pointEarned();
        frank.pointEarned();
        james.pointEarned();

        assertEquals(game.getScore(), "thirty, fifteen");
    }

    @Test
    public void fortyequals3() {
        james.pointEarned();
        james.pointEarned();
        james.pointEarned();

        assertEquals(game.getScore(), "forty, love");

    }

    @Test
    public void advantageiswhenscoreis4to3() {
        james.pointEarned();
        james.pointEarned();
        frank.pointEarned();
        james.pointEarned();
        frank.pointEarned();
        frank.pointEarned();
        frank.pointEarned();


        assertEquals(game.getScore(), "advantage Frank");
    }

    @Test
    public void deucewhenplayersareequalat3ormore() {
        james.pointEarned();
        james.pointEarned();
        james.pointEarned();
        frank.pointEarned();
        frank.pointEarned();
        frank.pointEarned();

        assertEquals(game.getScore(), "deuce");
        frank.pointEarned();
        assertEquals(game.getScore(), "advantage Frank");
        james.pointEarned();
        assertEquals(game.getScore(), "deuce");
    }


    @Test
    public void gameShouldBeWonByTheFirstPlayerToHaveWonAtLeastFourPointsInTotalAndWithAtLeastTwoPointsMoreThanTheOpponent() {
        james.pointEarned();
        james.pointEarned();
        james.pointEarned();
        frank.pointEarned();
        frank.pointEarned();
        frank.pointEarned();
        frank.pointEarned();
        frank.pointEarned();

        assertEquals(game.getScore(), "Frank wins");

    }

}

