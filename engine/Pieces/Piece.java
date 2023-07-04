package engine.Pieces;

import engine.player.Alliance;

public abstract class Piece {
    final PieceType pieceType;
    final Alliance pieceAlliance;
    final int piecePosition;
    final boolean isFirstMove;
    Piece(
        final PieceType type,
        final Alliance alliance,
        final int piecePosition,
        final boolean isFirstMove
    )
    {
        this.pieceType = type;
        this.piecePosition = piecePosition;
        this.pieceAlliance = alliance;
        this.isFirstMove = isFirstMove;
    }

    public PieceType getPieceType() {
        return this.pieceType;
    }

    public Alliance getAlliance() {
        return this.pieceAlliance;
    }

    public boolean isFirstMove() {
        return this.isFirstMove;
    }

    public int getPiecePosition() {
        return this.piecePosition;
    }

    public enum PieceType {

        PAWN(100, "P"),
        KNIGHT(325, "N"),
        BISHOP(325, "B"),
        ROOK(500, "R"),
        QUEEN(900, "Q"),
        KING(100000, "K");

        private final int value;
        private final String pieceName;

        public int getPieceValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return this.pieceName;
        }

        PieceType(final int val,
                  final String pieceName) {
            this.value = val;
            this.pieceName = pieceName;
        }

    }


}

