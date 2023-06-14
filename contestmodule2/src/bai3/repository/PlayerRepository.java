package bai3.repository;

import bai3.common.ReadToFile;
import bai3.common.WriteToFile;
import bai3.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements IPlayerRepository{
    private static final String PATH_PLAYER = "src/bai3/ultils/player.csv";
    private static List<Player> playerList = new ArrayList<>();
    @Override
    public List<Player> displayPlayer() {
        List<String>stringList = ReadToFile.readToFile(PATH_PLAYER);
        playerList.clear();
        String[] info;
        for (String str:stringList) {
            info = str.split(",");
            playerList.add(new Player(info[0],info[1],info[2],info[3],info[4]));
        }
        return playerList;
    }

    @Override
    public void addPlayer(Player player) {
        List<String> stringList = new ArrayList<>();
        stringList.add(player.getIdPlayer()+","+player.getNamePlayer()+","+player.getDayOfBirth()+","+player.getAddress()+","+player.getFootballClub());
        WriteToFile.writeToFile(PATH_PLAYER,stringList,true);
    }

    @Override
    public Player getIdPlayer(String idPlayer) {
        playerList = displayPlayer() ;
        for (Player player: playerList) {
            if(player.getIdPlayer().equals(idPlayer)){
                return player;
            }
        }
        return null;
    }
}
