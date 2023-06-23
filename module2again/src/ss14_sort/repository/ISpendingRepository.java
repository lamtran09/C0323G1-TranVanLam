package ss14_sort.repository;

import ss14_sort.model.Spending;

import java.util.List;

public interface ISpendingRepository {
    List<Spending> displaySpending();
    Spending getByID(String idSpending);
    void add(Spending spending);
    void delete(Spending spending);
    void update(String id, Spending spending);
    List<Spending> searchNameSpending(String nameSpending);
    List<Spending> searchIdSpending(String idSpending);
    List<Spending> sortName(List<Spending> spendingNameList);
    List<Spending> sortPrice(List<Spending> spendingPriceList);
}
