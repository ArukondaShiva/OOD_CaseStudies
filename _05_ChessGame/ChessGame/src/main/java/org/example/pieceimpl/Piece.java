package org.example.pieceimpl;

import org.example.blockboardmoveplayerimpl.Block;
import org.example.blockboardmoveplayerimpl.Board;

public abstract class Piece {

    private boolean white;
    private boolean killed = false;


    public abstract boolean canMove(Board board, Block startBlock, Block endBlock);


    public Piece(boolean white){
        this.white = white;
    }


    public boolean isWhite(){
        return white;
    }

    public boolean isKilled(){
        return killed;
    }


    public void setKilled(boolean killed){
        this.killed = killed;
    }

}
