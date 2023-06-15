package ss7_abstract_class_interface.service;

import ss7_abstract_class_interface.model.NaturalBook;
import ss7_abstract_class_interface.model.SocialBook;
import ss7_abstract_class_interface.repository.SocialRepository;

import java.util.List;
import java.util.Scanner;

public class SocialService implements ISocialService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SocialRepository socialRepository = new SocialRepository();

    @Override
    public void display() {
        List<SocialBook> socialBooks = socialRepository.display();
        for (SocialBook socialBook : socialBooks) {
            System.out.println(socialBook);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên sách Social : ");
        String nameBook = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        String publishingCompany = scanner.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        String publishingYear = scanner.nextLine();
        System.out.println("Nhập số lượng xuất bản: ");
        int numberOfPublications = Integer.parseInt(scanner.nextLine());
        SocialBook socialBook = new SocialBook(nameBook, publishingCompany, publishingYear, numberOfPublications);
        socialRepository.add(socialBook);
        System.out.println("Thêm thành công!!!");
    }
}
