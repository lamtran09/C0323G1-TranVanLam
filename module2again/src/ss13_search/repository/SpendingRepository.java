package ss13_search.repository;

import ss13_search.common.ReadWriteToFile;
import ss13_search.model.Spending;

import java.util.ArrayList;
import java.util.List;

public class SpendingRepository implements ISpendingRepository {
    private static final String PATH_SPENDING = "src/ss13_search/ultils/spending.csv";
    private static List<Spending> spendingList = new ArrayList<>();

    @Override
    public List<Spending> displaySpending() {
        List<String> stringList = ReadWriteToFile.readToFile(PATH_SPENDING);
        spendingList.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            spendingList.add(new Spending(info[0], info[1], info[2], Long.parseLong(info[3]), info[4]));
        }
        if (spendingList.isEmpty()) {
            System.out.println("Hệ thống chưa có thông tin");
        }
        return spendingList;
    }

    @Override
    public Spending getByID(String idSpending) {
        spendingList = displaySpending();
        for (Spending spending : spendingList) {
            if (spending.getIdSpending().equals(idSpending)) {
                return spending;
            }
        }
        return null;
    }

    @Override
    public void add(Spending spending) {
        List<String> stringList = new ArrayList<>();
        stringList.add(spending.getIdSpending() + "," + spending.getNameSpending() + "," + spending.getDateSpending() + "," + spending.getPrince() + "," + spending.getDescribe());
        ReadWriteToFile.writeToFile(PATH_SPENDING, stringList, true);
    }

    @Override
    public void delete(Spending spending) {
        spendingList = displaySpending();
        spendingList.remove(spending);
        List<String> stringList = new ArrayList<>();
        for (Spending spending1 : spendingList) {
            stringList.add(spending1.getIdSpending() + "," + spending1.getNameSpending() + "," + spending1.getDateSpending() + "," + spending1.getPrince() + "," + spending1.getDescribe());
        }
        ReadWriteToFile.writeToFile(PATH_SPENDING, stringList, false);
    }

    @Override
    public List<Spending> searchNameSpending(String nameSpending) {
        spendingList = displaySpending();
        List<Spending> spendingList1 = new ArrayList<>();
        for (Spending spending : spendingList) {
            if (spending.getNameSpending().contains(nameSpending)) {
                spendingList1.add(spending);
            }
        }
        return spendingList1;
    }

    @Override
    public List<Spending> searchIdSpending(String idSpending) {
        spendingList = displaySpending();
        List<Spending> spendingList1 = new ArrayList<>();
        for (Spending spending : spendingList) {
            if (spending.getIdSpending().equals(idSpending)) {
                spendingList1.add(spending);
            }
        }
        return spendingList1;
    }
}
