package ss7_abstract_class_interface.model;

public abstract class Book {
    private String nameBook;
    private String publishingCompany;
    private String publishingYear;

    public Book() {
    }

    public Book(String nameBook, String publishingCompany, String publishingYear) {
        this.nameBook = nameBook;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return " Tên sách: '" + nameBook + '\'' +
                ", Nhà xuất bản: '" + publishingCompany + '\'' +
                ", Năm xuất bản: '" + publishingYear + '\'';
    }
}
