package org.example.pieceimpl;

import org.example.blockboardmoveplayerimpl.Block;
import org.example.blockboardmoveplayerimpl.Board;

public class Rook extends Piece{
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
