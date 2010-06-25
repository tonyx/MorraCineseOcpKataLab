package org.tonyx;

/**
 * Created by IntelliJ IDEA.
 * User: antonio.lucca
 * Date: 25-giu-2010
 * Time: 13.44.25
 * To change this template use File | Settings | File Templates.
 */
public class Move {
    String status;
    public Move(String status){
        this.status = status;
    }
    public String getStatus()
    {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Move)) return false;

        Move move = (Move) o;

        if (status != null ? !status.equals(move.status) : move.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return status != null ? status.hashCode() : 0;
    }
}
