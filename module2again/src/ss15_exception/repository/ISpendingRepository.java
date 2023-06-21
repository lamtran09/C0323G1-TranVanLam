package ss15_exception.repository;

import ss15_exception.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> displaySpending();
    Spending getByID(String idSpending);
    void add(Spending spending);
    void delete(Spending spending);
    List<Spending> searchNameSpending(String nameSpending);
    List<Spending> searchIdSpending(String idSpending);
}
