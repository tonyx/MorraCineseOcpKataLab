package org.tonyx;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: antonio.lucca
 * Date: 25-giu-2010
 * Time: 13.34.39
 * To change this template use File | Settings | File Templates.
 */
public class MorraTest {
    @Test
    public void testSassoBatteForbici()
    {
        Player giocasasso = new Player();
        giocasasso.plays(new Move("sasso"));
        Player giocaforbici = new Player();
        giocaforbici.plays(new Move("forbici"));
        Game game = MorraGameFactory.create();
        assertEquals(giocasasso,game.getWinner(giocasasso,giocaforbici));
    }

    @Test
    public void forbiciBatteCarta()
    {
        Player giocaforbici = new Player();
        giocaforbici.plays(new Move("forbici"));
        Player giocacarta = new Player();
        giocacarta.plays(new Move("carta"));
        Game game = MorraGameFactory.create();
        assertEquals(giocaforbici,game.getWinner(giocacarta,giocaforbici));
    }
}
