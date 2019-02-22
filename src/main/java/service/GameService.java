package service;

import model.Player;
import model.enums.Winner;

public interface GameService {
    Winner judge(Player player1, Player player2);
}
