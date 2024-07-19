package org.example.pieceimpl;

import org.example.blockboardmoveplayerimpl.Block;
import org.example.blockboardmoveplayerimpl.Board;

public class Queen extends Piece{
    public Queen(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}
