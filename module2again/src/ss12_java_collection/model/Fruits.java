package ss12_java_collection.model;

public class Fruits implements Comparable<Fruits> {
    private String nameFruits;
    private String kindOfFruits;
    private String dateOfManufacture;
    private String expiry;
    private String origin;
    private long price;

    public Fruits() {
    }

    public Fruits(String nameFruits, String kindOfFruits, String dateOfManufacture, String expiry, String origin, long price) {
        this.nameFruits = nameFruits;
        this.kindOfFruits = kindOfFruits;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.origin = origin;
        this.price = price;
    }

    public String getNameFruits() {
        return nameFruits;
    }

    public void setNameFruits(String nameFruits) {
        this.nameFruits = nameFruits;
    }

    public String getKindOfFruits() {
        return kindOfFruits;
    }

    public void setKindOfFruits(String kindOfFruits) {
        this.kindOfFruits = kindOfFruits;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Trái Cây: " +
                "Tên: '" + nameFruits + '\'' +
                ", Loại trái cây'" + kindOfFruits + '\'' +
                ", ngày sản xuất: '" + dateOfManufacture + '\'' +
                ", hạn sử dụng: '" + expiry + '\'' +
                ", xuất xứ: '" + origin + '\'' +
                ", giá: " + price;
    }

    @Override
    public int compareTo(Fruits o) {
        return (int) (this.price-o.price);
    }
}
