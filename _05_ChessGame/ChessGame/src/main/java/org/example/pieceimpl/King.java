package org.example.pieceimpl;

import org.example.blockboardmoveplayerimpl.Block;
import org.example.blockboardmoveplayerimpl.Board;

public class King extends Piece{
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
