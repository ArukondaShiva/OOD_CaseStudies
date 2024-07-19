package org.example.blockboardmoveplayerimpl;

public class Move {

    private Block startBlock;
    private Block endBlock;


    public Move(Block startBlock, Block endBlock){
        this.startBlock = startBlock;
        this.endBlock = endBlock;
    }

    public boolean isValid(){
        return !(startBlock.getPiece().isWhite() == endBlock.getPiece().isWhite());
    }

    public Block getStartBlock(){
        return startBlock;
    }

    public Block getEndBlock(){
        return endBlock;
    }

}
