package ss17_binary_file.repository;

import ss17_binary_file.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> displaySpending();
    Spending getByID(String idSpending);
    void add(Spending spending);
    void delete(Spending spending);

}
