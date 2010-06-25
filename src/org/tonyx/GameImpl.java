package org.tonyx;

/**
 * Created by IntelliJ IDEA.
 * User: antonio.lucca
 * Date: 25-giu-2010
 * Time: 13.46.59
 * To change this template use File | Settings | File Templates.
 */
public class GameImpl implements Game {
    private final static Move forbici = new Move("forbici");
    private final static Move sasso = new Move("sasso");
    private final static Move carta = new Move("carta");
    public Player getWinner(Player first, Player second) {
        return first;
    }
}
