package engine.board;

import engine.Pieces.Piece;

public class Move {

    final int destinationCoordinate;
    final Piece movedPiece;
    final boolean isFirstMove;

    private Move(final Piece movedPiece, final int destinationCoordinate){
        this.movedPiece = movedPiece;
        this.destinationCoordinate = destinationCoordinate;
        this.isFirstMove = movedPiece.isFirstMove();
    }

    public enum MoveStatus {
        DONE {
            public boolean isDone(){
                return true;
            }
        },

        ILLEGAL_MOVE {
            public boolean isIllegal(){
                return false;
            }
        },

        LEAVES_IN_CHECK {
            public boolean isCheck(){
                return false;
            }
        }

    }
}
