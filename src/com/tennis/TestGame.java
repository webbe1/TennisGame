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
        frank.winBall();
        assertEquals(game.getScore(), "love, fifteen");
    }

    @Test
    public void thirtyequals2() {
        james.winBall();
        frank.winBall();
        james.winBall();

        assertEquals(game.getScore(), "thirty, fifteen");
    }

    @Test
    public void fortyequals3() {
        james.winBall();
        james.winBall();
        james.winBall();

        assertEquals(game.getScore(), "forty, love");

    }

    @Test
    public void advantageiswhenscoreis4to3() {
        james.winBall();
        james.winBall();
        frank.winBall();
        james.winBall();
        frank.winBall();
        frank.winBall();
        frank.winBall();


        assertEquals(game.getScore(), "advantage Frank");
    }

    @Test
    public void deucewhenplayersareequalat3ormore() {
        james.winBall();
        james.winBall();
        james.winBall();
        frank.winBall();
        frank.winBall();
        frank.winBall();

        assertEquals(game.getScore(), "deuce");
        frank.winBall();
        assertEquals(game.getScore(), "advantage Frank");
        james.winBall();
        assertEquals(game.getScore(), "deuce");
    }


    @Test
    public void gameShouldBeWonByTheFirstPlayerToHaveWonAtLeastFourPointsInTotalAndWithAtLeastTwoPointsMoreThanTheOpponent() {
        james.winBall();
        james.winBall();
        james.winBall();
        frank.winBall();
        frank.winBall();
        frank.winBall();
        frank.winBall();
        frank.winBall();

        assertEquals(game.getScore(), "Frank wins");

    }

}

