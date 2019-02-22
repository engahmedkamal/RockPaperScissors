package service;

import model.enums.Shape;

public interface GamePlay {
    void play(Shape humanSelectedShape);

    void announceWinner();
}
