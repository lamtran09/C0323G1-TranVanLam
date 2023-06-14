package bai3.model;

import java.util.Objects;

public class Player {
    private String idPlayer;
    private String namePlayer;
    private String dayOfBirth;
    private String address;
    private String footballClub;

    public Player() {
    }

    public Player(String idPlayer, String namePlayer, String dayOfBirth, String address, String footballClub) {
        this.idPlayer = idPlayer;
        this.namePlayer = namePlayer;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.footballClub = footballClub;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFootballClub() {
        return footballClub;
    }

    public void setFootballClub(String footballClub) {
        footballClub = footballClub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(idPlayer, player.idPlayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPlayer);
    }

    @Override
    public String toString() {
        return "Player" +
                ", idPlayer='" + idPlayer + '\'' +
                ", namePlayer='" + namePlayer + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", footballClub='" + footballClub + '\'';
    }
}
