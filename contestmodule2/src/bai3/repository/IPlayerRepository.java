package bai3.repository;


import bai3.model.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> displayPlayer();
    void addPlayer(Player player);
    Player getIdPlayer(String idPlayer);
}
