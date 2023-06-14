package bai3.service;

import bai3.common.Regex;
import bai3.model.Player;
import bai3.repository.PlayerRepository;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PlayerService implements IPlayerService{
    private static final PlayerRepository playerRepository = new PlayerRepository();
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void displayPlayer() {
        List<Player> playerList = playerRepository.displayPlayer();
        for (Player player: playerList) {
            System.out.println(player);
        }
    }

    @Override
    public void addPlayer() {
        String idPlayer;
        do {
            System.out.println("Nhâp mã cầu thủ muốn thêm(theo định dạng CT-YYY, với Y là số từ 0-9): ");
            idPlayer = scanner.nextLine();
        }while(!Regex.validateIdPlayer(idPlayer));
        String namePlayer;
//        do{
            System.out.println("Nhập tên cầu thủ: ");
            namePlayer = scanner.nextLine();
//        }while (!Regex.validateNamePlayer(namePlayer));
        String dayOfBirth;
        do {
            System.out.println("Nhập ngày sinh của cầu thủ(theo định dạng dd/mm/yyyy)): ");
            dayOfBirth = scanner.nextLine();
        }while(!Regex.validateDayOfBirthPlayer(dayOfBirth));

        System.out.println("Nhập địa chỉ của cầu thủ: ");
        String address = scanner.nextLine();

        System.out.println("Nhập đội mà cầu thủ đang thi đấu: ");
        String footballClub = scanner.nextLine();
        Player player = new Player(idPlayer,namePlayer,dayOfBirth,address,footballClub);
        playerRepository.addPlayer(player);
        System.out.println("Thêm thành công");
    }

    @Override
    public void penalty() {
        System.out.println("Nhập mã cầu thủ sút penalty: ");
        String idPlayer = scanner.nextLine();
        Player player = playerRepository.getIdPlayer(idPlayer);
        if(player == null){
            System.out.println("Không có mã cầu thủ này trong hệ thống");
        }else{
            System.out.println("Bạn muốn dùng cầu thủ "+player.getNamePlayer()+" để sút penalty");
            System.out.println("1.Đúng vậy\n" +
                    "2.Suy nghĩ lại");
            System.out.println("Chọn chức năng: ");
            String choice = scanner.nextLine();
            if(Objects.equals(choice, "1")){
                System.out.println("Chọn góc muốn sút\n" +
                        "1\n" +
                        "2\n" +
                        "3\n" +
                        "2\n" +
                        "5\n" +
                        "6\n" +
                        "--------");
                int soccer = Integer.parseInt(scanner.nextLine());
                if(soccer == Math.random()){
                    System.out.println("Vàooooooooooo");
                }else {
                    System.out.println("Không vàooooooooooo");
                }
            }
        }
    }
}
