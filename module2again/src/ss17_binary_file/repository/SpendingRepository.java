package ss17_binary_file.repository;

import ss17_binary_file.common.ReadWriteToFile;
import ss17_binary_file.model.Spending;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepository implements ISpendingRepository {
    private static final String PATH_SPENDING = "src/ss17_binary_file/ultils/spending.dat";

    @Override
    public List<Spending> displaySpending() {
        List<Spending> spendings = ReadWriteToFile.readToFile(PATH_SPENDING);
        return spendings;
    }

    @Override
    public Spending getByID(String idSpending) {
        List<Spending> spendingList = ReadWriteToFile.readToFile(PATH_SPENDING);
        for (Spending spending : spendingList) {
            if (spending.getIdSpending().equals(idSpending)) {
                return spending;
            }
        }
        return null;
    }

    @Override
    public void add(Spending spending) {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadWriteToFile.readToFile(PATH_SPENDING);
        spendingList.add(spending);
        ReadWriteToFile.writeToFile(PATH_SPENDING, spendingList);
    }

    @Override
    public void delete(Spending spending) {
        List<Spending> spendingList = new ArrayList<>();
        spendingList = ReadWriteToFile.readToFile(PATH_SPENDING);
        spendingList.remove(spending);
        ReadWriteToFile.writeToFile(PATH_SPENDING, spendingList);
    }
}