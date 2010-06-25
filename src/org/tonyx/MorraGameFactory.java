package org.tonyx;

/**
 * Created by IntelliJ IDEA.
 * User: antonio.lucca
 * Date: 25-giu-2010
 * Time: 13.40.44
 * To change this template use File | Settings | File Templates.
 */
public class MorraGameFactory {
    public static Game create() {
        return new GameImpl();
    }
}
