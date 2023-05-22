package ss12_java_collection_framework.bai_tap.model;

public class Product {
    private int id;
    private String nameProduct;
    private float price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String nameProduct, float price, int quantity) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
