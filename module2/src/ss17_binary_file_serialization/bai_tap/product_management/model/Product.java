package ss17_binary_file_serialization.bai_tap.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private java.lang.String idProduct;
    private java.lang.String nameProduct;
    private java.lang.String price;
    private java.lang.String productive;
    private java.lang.String describe;

    public Product() {
    }

    /**
     *
     * @param idProduct  - Mã sản phẩm
     * @param nameProduct    - Tên sản phẩm
     * @param price  - Giá
     * @param productive     - Hàng sản xuất
     * @param describe    - Mô tả
     *
     * @creator: Lâm
     */
    public Product(java.lang.String idProduct, java.lang.String nameProduct, java.lang.String price, java.lang.String productive, java.lang.String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.productive = productive;
        this.describe = describe;
    }

    public java.lang.String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(java.lang.String idProduct) {
        this.idProduct = idProduct;
    }

    public java.lang.String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(java.lang.String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public java.lang.String getPrice() {
        return price;
    }

    public void setPrice(java.lang.String price) {
        this.price = price;
    }

    public java.lang.String getProductive() {
        return productive;
    }

    public void setProductive(java.lang.String productive) {
        this.productive = productive;
    }

    public java.lang.String getDescribe() {
        return describe;
    }

    public void setDescribe(java.lang.String describe) {
        this.describe = describe;
    }

    @Override
    public java.lang.String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", productive='" + productive + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
