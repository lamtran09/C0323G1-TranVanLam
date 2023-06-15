package ss7_abstract_class_interface.service;

import ss7_abstract_class_interface.model.NaturalBook;
import ss7_abstract_class_interface.repository.NaturalRepository;

import java.util.List;
import java.util.Scanner;

public class NaturalService implements INaturalService{
    private static final Scanner scanner = new Scanner(System.in);
    private static final NaturalRepository naturalRepository = new NaturalRepository();
    @Override
    public void display() {
        List<NaturalBook> naturalBookList = naturalRepository.display();
        for (NaturalBook book: naturalBookList) {
            System.out.println(book);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập tên sách Natural : ");
        String nameBook = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        String publishingCompany = scanner.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        String publishingYear = scanner.nextLine();
        System.out.println("Nhập tác giả: ");
        String author = scanner.nextLine();
        NaturalBook naturalBook = new NaturalBook(nameBook,publishingCompany,publishingYear,author);
        naturalRepository.addNatural(naturalBook);
        System.out.println("Thêm thành công!!!");
    }
}
