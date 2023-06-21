package ss16_io_text_file.model;

import java.util.Objects;

public class Spending {
    private String idSpending;
    private String nameSpending;
    private String dateSpending;
    private long prince;
    private String describe;

    public Spending() {
    }

    public Spending(String idSpending, String nameSpending, String dateSpending, long prince, String describe) {
        this.idSpending = idSpending;
        this.nameSpending = nameSpending;
        this.dateSpending = dateSpending;
        this.prince = prince;
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

    public long getPrince() {
        return prince;
    }

    public void setPrince(long prince) {
        this.prince = prince;
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
                ", Số tiền chi: " + prince +
                ", Mô tả thêm: '" + describe + '\'' ;
    }
}
