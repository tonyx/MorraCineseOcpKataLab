package org.tonyx;

/**
 * Created by IntelliJ IDEA.
 * User: antonio.lucca
 * Date: 25-giu-2010
 * Time: 13.43.26
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    Move move;
    public void plays(Move move) {
        this.move = move;
    }
    public Move getMove() {
        return move;
    }

    @Override
    public String toString() {
        return move.getStatus();
    }
}
