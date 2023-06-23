package ss14_sort.model;

import java.util.Objects;

public class Spending implements Comparable<Spending> {
    private String idSpending;
    private String nameSpending;
    private String dateSpending;
    private long price;
    private String describe;

    public Spending() {
    }

    public Spending(String idSpending, String nameSpending, String dateSpending, long prince, String describe) {
        this.idSpending = idSpending;
        this.nameSpending = nameSpending;
        this.dateSpending = dateSpending;
        this.price = prince;
        this.describe = describe;
    }

    public String getIdSpending() {
        return idSpending;
    }

    public void setIdSpending(String idSpending) {
        this.idSpending = idSpending;
    }

    public String getNameSpending() {
        return nameSpending;
    }

    public void setNameSpending(String nameSpending) {
        this.nameSpending = nameSpending;
    }

    public String getDateSpending() {
        return dateSpending;
    }

    public void setDateSpending(String dateSpending) {
        this.dateSpending = dateSpending;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spending spending = (Spending) o;
        return Objects.equals(idSpending, spending.idSpending) && Objects.equals(nameSpending, spending.nameSpending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSpending, nameSpending);
    }

    @Override
    public String toString() {
        return "Chi tiêu: " +
                "Mã chi tiêu: '" + idSpending + '\'' +
                ", Tên chi tiêu: '" + nameSpending + '\'' +
                ", Ngày chi tiêu: '" + dateSpending + '\'' +
                ", Số tiền chi: " + price +
                ", Mô tả thêm: '" + describe + '\'';
    }

    @Override
    public int compareTo(Spending o) {
        if (this.price - o.price > 0) {
            return 1;
        } else if (this.price - o.price < 0) {
            return -1;
        } else
            return 0;
    }
}
