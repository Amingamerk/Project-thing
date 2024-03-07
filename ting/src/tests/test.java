package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import classes.*;

public class test {

    @Test
    public void testGuessNumber() {
        
        int randomNumber = (int) (Math.random() * 10) + 1;

        
        Game game = new Game();

        boolean guessedRight = false;

       
        for (int i = 0; i < 2000; i++) {
            
            int guessedNumber = (int) (Math.random() * 10) + 1;

            if (game.guess(guessedNumber, randomNumber)) guessedRight = true;
            
        }

        assertTrue(guessedRight);
    }
}
