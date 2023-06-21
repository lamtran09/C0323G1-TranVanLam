package ss16_io_text_file.repository;

import ss16_io_text_file.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> displaySpending();
    Spending getByID(String idSpending);
    void add(Spending spending);
    void delete(Spending spending);
    List<Spending> searchNameSpending(String nameSpending);
    List<Spending> searchIdSpending(String idSpending);
}
