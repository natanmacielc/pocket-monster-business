package pokemon.enums;

import pokemon.Move;

import static battle.in.BattleMoveAssembler.fireSpecialMoveAE;
import static battle.in.BattleMoveAssembler.normalPhysicalMove;
import static battle.in.BattleMoveAssembler.waterSpecialAE;

public enum Moves {
    POUND(normalPhysicalMove("Pound", 35, 40d, 100d)),
    TACKLE(normalPhysicalMove("Tackle", 35, 40d, 100d)),
    EMBER(fireSpecialMoveAE("Ember", 25, 40d, 100d, Status.BURNED, 30d)),
    CUT(normalPhysicalMove("Cut", 30, 50d, 95d)),
    BUBBLE_BEAM(waterSpecialAE("Bubble Beam", 20, 65d, 100d, Status.SPEED, 33.2));
    private Move move;
    private Moves(Move move) {
        this.move = move;
    }

    public Move getMove() {
        return this.move;
    }
}
